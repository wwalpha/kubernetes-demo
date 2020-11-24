## Database Tables(Test)

### Hotel

| Column | Type    | Comment   |
| ------ | ------- | --------- |
| id     | long    | ホテル ID |
| name   | varchar | ホテル名  |
| stars  | int     | 星数      |

### Room

| Column   | Type    | Comment                                |
| -------- | ------- | -------------------------------------- |
| id       | long    | 部屋 ID                                |
| hotelId  | long    | ホテル ID                              |
| roomNo   | varchar | 部屋番号                               |
| roomType | varchar | 部屋タイプ：エコノミー／ビジネス／豪華 |
| cost     | long    | 価格                                   |
| beds     | int     | ベッド数                               |

### Reservation

| Column   | Type    | Comment                                |
| -------- | ------- | -------------------------------------- |
| id       | long    | 部屋 ID                                |
| hotelId  | long    | ホテル ID                              |
| roomNo   | varchar | 部屋番号                               |
| roomType | varchar | 部屋タイプ：エコノミー／ビジネス／豪華 |
| cost     | long    | 価格                                   |
| beds     | int     | ベッド数                               |

### History

## Libraries

| GroupId                     | ArtifactId                       | Comment            |
| --------------------------- | -------------------------------- | ------------------ |
| org.springframework.boot    | spring-boot-starter-parent       | Spring Boot Core   |
| org.springframework.boot    | spring-boot-starter-data-jpa     | JPA Library        |
| org.springframework.boot    | spring-boot-starter-security     | Spring Security    |
| org.springframework.boot    | spring-boot-starter-thymeleaf    | Thymeleaf          |
| org.springframework.boot    | spring-boot-starter-validation   | Spring Boot Core   |
| org.springframework.boot    | spring-boot-starter-web          | Spring Boot Core   |
| org.springframework.boot    | spring-boot-starter-tomcat       | Tomcat             |
| org.springframework.session | spring-session-core              | Spring Session     |
| org.thymeleaf.extras        | thymeleaf-extras-springsecurity5 |
| nz.net.ultraq.thymeleaf     | thymeleaf-layout-dialect         |
| com.h2database              | h2                               | h2 database driver |
| com.querydsl                | querydsl-jpa                     |
| com.querydsl                | querydsl-apt                     |
| org.webjars                 | jquery                           |
| org.webjars                 | jquery-ui                        |
| org.webjars                 | bootstrap                        |
| org.webjars                 | font-awesome                     |
