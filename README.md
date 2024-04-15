# Spring Boot 서버 만들어보기
Spring Boot F/W를 사용하여 직접 Application Server를 만들어보는 시간을 갖습니다.

## 주요 환경

```markdown
* java 17
* Spring Boot 3.2.4
```

## 수업 방식
* 수업 진행 전 어떤 내용으로 수업을 할지 공유합니다.
* 수업 중 추가되는 내용은 live-coding으로 해결하고, 추후 소스코드를 정리하여 공유합니다.
* mission이 있다면 mission을 해결할 충분한 시간을 부여하고, '나(전지환)'가 푸는 방식도 공유합니다. 

## 수업 타임라인
* [2024-03-18]()
* [2024-03-25]()
* [2024-04-01]()
* [2024-04-08]()
* [2024-04-15]()

## Version Control
강의에 사용하는 `demo` 프로젝트는 Git & GitHub 을 통해 버전 관리 됩니다.  
수강생들은 `demo` project를 fork를 따서 본인 자료(orgin remote)와 수업 자료(upstream remote)를 동시에 관리할 수 있습니다. 

### Branch Strategy
* 비정규 강의 자료: `master`
* 정규(회차별) 강의 자료: `lecture/{yyyy-MM-dd-detail}`

정규 강의에서 다루는 내용이 아니면 `master` 에 커밋하고, 정규 강의에서 다루는 내용이라면 `lecture/**` 에 커밋합니다.  
`lecture/**`의 경우 master 쪽으로 PullRequest를 열어 수업외의 추가적인 질의응답을 갖습니다.  
기본적으로 모든 branch는 `master`를 기준으로 생성되며, 최종적으로는 `master` 에 merge 됩니다.
