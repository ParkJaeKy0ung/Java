package edu.kh.project.common.interceptor;

import java.util.Map;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

import jakarta.servlet.http.HttpSession;

/*가로채서!!!*/

@Component // bean 등록
public class ChattingHandshakeInterceptor implements HandshakeInterceptor{

	// WebSocketHandler가 동작하기 전
	@Override
	public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler,
			Map<String, Object> attributes) throws Exception {
		
		if(request instanceof ServletServerHttpRequest) {
		  // 부모 				자식
			
			ServletServerHttpRequest servletRequest = (ServletServerHttpRequest)request; // 다운캐스팅
			
			// 웹소켓에 접속한 클라이언트의 세션을 얻어옴
			HttpSession session = servletRequest.getServletRequest().getSession();
									// HttpServletRequest			의 session
			
			// Map<String, Object> attributes
			// -> WebSocketHandler의 WebSocketSession에 담을 내용(값)을 세팅하는 Map
			attributes.put("session", session);
			// ChattingWebsocketHandler에서 쓸 수 있도록 세팅함
		}
		
		return true; // !!! true !!!
	}

	@Override
	public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler,
			Exception exception) {
		
	}

}
