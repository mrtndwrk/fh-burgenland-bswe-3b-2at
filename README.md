# SWM 2AT
This repository has been forked from https://github.com/muhlba91/fh-burgenland-bswe-3b-2at. 
I've implemented the following features:
- Branch Protection
  - Branch protection for main has been enabled
  - Require PR before merging. without approvals
  - require status checks to pass and branches to be up to date. All status checks from the pipeline have been selected
  - require linear history
    
- Javadoc has been written for 
  - the controller
  - the service
  - the repository
 
- Unit Tests for
  - Person Service
  - Note Service
  - Controller

- Checkstyle has been added

- Containerization
  - Dockerfile has been created and optimized for the pipeline

- Pipeline includes
  - Unit Tests
  - Lint (Checkstyle and Hadolint)
  - Build (runnable jar file)
  - Container being pushed to GitHub Container Registry
