Task 4

**NOTE:** [README First](/README.md)

### Requirements

- Node
- Docker

#### Dependencies

- axios	//Promise based HTTP client for the browser and node.js
- bootstrap
- react
- react-dom
- react-scripts
- react-toastify	//To generate toast message
- reactstrap

## Building steps

1. Open the folder `/task2` in your favourite IDE ( VS Code :heart:)
Wait for few minutes while the IDE loads and completes necessary pre-build tasks.

2. Run `npm install`
This will install dependencies.

3. Run `npm start`
React application will start on port `3000` of the `localhost`.

4. Run `npm run build`
This will build the artifacts in `/build` folder.

## CRUD methods

```javascript
createServer();	//axios.put
    
deleteServer(id);	//axios.delete
    
findServerById(id);	//axios.get

findServerByName(name);	//axios.get
```

#### Screenshots

![WebUiFormGIF](/screenshots/task4WebUiForm.gif)

![WebUIForm](/screenshots/WebUIForm.png)


![CreateWebUIForm](/screenshots/createWebUIForm.PNG)

## Containerizing the app

`Dockerfile` contains all the commands required to build the app image

`
FROM nginx:alpine
COPY /build /usr/share/nginx/html
EXPOSE 80
ENTRYPOINT ["nginx", "-g", "daemon off;"]
`

1. Run the following command to build docker image
`sudo docker build -t <container_image_name> .`
This will create the app container image and add to you local repository.

2. To Run the app from container, run the following command
`sudo docker run -p 80:3000 <container_image_name>`
React Web Application will load and start on port `3000` of the `localhost`
You will see application logs in the terminal.

**Note:** *The docker-compose part is Documented in Task3*

This project was bootstrapped with [Create React App](https://github.com/facebook/create-react-app).

## Available Scripts

In the project directory, you can run:

### `npm start`

Runs the app in the development mode.<br />
Open [http://localhost:3000](http://localhost:3000) to view it in the browser.

The page will reload if you make edits.<br />
You will also see any lint errors in the console.

### `npm test`

Launches the test runner in the interactive watch mode.<br />
See the section about [running tests](https://facebook.github.io/create-react-app/docs/running-tests) for more information.

