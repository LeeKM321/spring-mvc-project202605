package com.codeit.mvc.exception;

// 파일 저장, 삭제, 조회 등에서 발생하는 런타임 예외
public class FileStorageException extends RuntimeException {
  // 예외 발생 시 메시지만 받아서 노출시키고 끝
  public FileStorageException(String message) {
    super(message);
  }

  // 예외 발생 시 메시지와 예외 객체 자체를 전달받아서 상위 계층에 전파
  // 이렇게 해야 예외의 원인을 역추적했을 때 진짜 원인 등을 콘솔에서 확인이 가능.
  public FileStorageException(String message, Throwable cause) {
    super(message, cause);
  }
}
