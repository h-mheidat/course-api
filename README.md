# course-api
the java spring boot restful API for course
# for developer 
build Docker: $`docker build -t course-api .`  
# RUN
run Docker: $`docker run -p 8080:8080 course-api:latest`  
After that containers is up, in another tab, you'll need to seed the database.  
`http://localhost:8080/seed`  
swagger-ui: `http://localhost:8080/swagger-ui.html`
