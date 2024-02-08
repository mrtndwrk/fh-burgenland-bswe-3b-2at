# SWM 2AT
This repository has been forked from https://github.com/muhlba91/fh-burgenland-bswe-3b-2at. 
I've implemented the following features:



## Credits
This repository has been forked from the GitHub User https://github.com/muhlba91
It has then been improved upon by https://github.com/mrtndwrk in the following points:
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
  -  config file can be found under `config/checkstyle/checkstyle.xml`
  -  
- Containerization
  - Dockerfile has been created and optimized for the pipeline

- Pipeline includes
  - Unit Tests
  - Lint (Checkstyle and Hadolint)
  - Build (runnable jar file)
  - Container being pushed to GitHub Container Registry
 
  - ## License
    This project uses the MIT License which can be found under `LICENSE.md` in the project's root folder
