## JWT + REST API
## Resource components
- 회원가입
- 로그인, 로그아웃
- 게시판

| method | resource      | description                       |
-----|:--------------|:----------------------------------|
POST   | `/api/auth/signup`     | 회원가입 |
POST   | `/api/auth/signin`     | 로그인 |
POST   | `/api/auth/signout`    | 로그아웃 |
POST   | `/api/board/post`      | 게시판 글작성 | 
GET    | `/api/board/post`      | 게시판 전체 글 목록 가져오기 |
GET    | `/api/board/post/{pathVariable}`  | 게시판 글읽기 |
PUT    | `/api/board/post/{pathVariable}` | 게시판 글수정 |
DELETE | `/api/board/post/{pathVariable}` | 게시판 글삭제 |

# API Example
## 회원가입
`{
"username" : "",
"email" : "",
"password" : ""
}
`
## 로그인
`{
"username" : "",
"password" : ""
}`
### return JWT
`"accessToken": ""`

---

# Authorization Bearer Token
로그인 성공시 얻은 accessToken의 값을 Bearer Token 리퀘스트 헤더에 담아서 요청합니다.

`Authorization : Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJxMSIsImlhdCI6MTYxMDUzOTg1MywiZXhwIjoxNjEwNjI2MjUzfQ.ixTbJ0fuy5zuH55Tz3-yxTskFYqt_pZ0qIRP49zrGogxKn-_u_FpsiiGYnvwTcXx-4SP1cd9yon282TBGZ9kew`
## 게시판 글작성

 모든 게시판 기능은 JWT 토큰이 있어야만 인증 후 자원 응답이 가능합니다.

`{
"title" : "",
"content" : "",
"author" : ""
}`


### AWS EC2 Server Address
`http://ec2-3-34-34-59.ap-northeast-2.compute.amazonaws.com:8080/`

## Documentation history
- v1, jwt 인증
- v2, 회원가입, 로그인, 로그아웃
- v3, 게시판 기능(CRUD)
