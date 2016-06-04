Slack 채널으로 메시지 보내기
======================

슬랙 Incoming WebHook API 으로 메시지를 보내는 간단한 예제

* SpringBoot 1.3.5.RELEASE
* RestTemplate 를 이용해서 전송

* url: http://localhost:8080/
* method: POST
* header: `application/json`
* body:
```
{
    "title": {title},
    "title_link": {link of title},
    "text": {message}
}
```