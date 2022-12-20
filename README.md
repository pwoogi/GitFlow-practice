# GitFlow 복습하기

- dev 브랜치 생성

- login 기능 구현

- logout 기능 구현

- find pw 기능 구현

- main 운영 배포 완료

- hotfix 기능 구현

- 수정 사항 main 운영 배포 완료

# Multi Module
1. 필요한 기능별로 Module 생성
2. 레고를 조립하듯 필요한 Module 조립
3. N개의 Module이 조립되어있는 프로젝트
</ br>
 
ex) 로그인 Module, 인증 Module, DB Entity Module 등등  


``````
즉, API, Batch 서버에서도 동일한 DB Entity가 필요하면 중복된 
Entity를 Module화 시켜서 사용하기 위해 Multi Module 프로젝트를 사용하는 것!

반대로 독립적으로 관리한다면 중복해서 관리해야하므로 Risk가 늘어난다.