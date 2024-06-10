# 개요

2024-05-20 에 진행하는 수업은 Docker를 활용한다.

* DB(MySQL)를 Docker Container 기반으로 실행한다.
* 위에서 실행한 DB에 각종 config를 수행한다.
* server application에서 해당 DB를 사용한다.

# 설정

## docker desktop 설치

https://www.docker.com/products/docker-desktop/

## docker 에 MySQL 이미지 가져오기

```shell
docker pull mysql
```

## MySQL 이미지를 container 로 실행하기

```shell
docker run -p 3306:3306 --name lecture-mysql -e MYSQL_ROOT_PASSWORD=1234 -d mysql:latest
```

* 기존에 localhost TCP 3306 port 를 쓰고 있다면 해당 PID 를 kill 하도록 합니다.

## bash 형태로 MySQL container에 접속하기

```shell
docker exec -it lecture-mysql bash
```

## root 계정으로 접근해서 각종 설정 진행하기

```shell
mysql -u root -p
```

## MySQL 서버에 데이터베이스 생성하기

```shell
create database lecture_service
```

* `lecture_service` 에는 본인이 원하는 DB 이름을 명시할 수 있습니다.

## MySQL 서버에 USER를 추가하고 database 권한 부여하기

```shell
# lecture-api 라는 이름의 사용자를 추가한다.
create user 'lecture-api'@'%' identified by '12345678';
# lecture-api 사용자에 아까 생성한 데이터베이스의 모든 권한을 부여한다.
grant all privileges on lecture_service.* to 'lecture-api'@'%';
```

* `identified by **` 뒤에는 비밀번호이고, 기본적으로 8자 이상이 요구되기에 이점 유의하자.
* `privileges on **` 뒤에는 앞서 생성한 DB 이름을 적어주면 된다. 
