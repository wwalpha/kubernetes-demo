FROM node:12.19.1-alpine

WORKDIR /usr/local/src

COPY app.js .
COPY package.json .

RUN yarn install

EXPOSE 8080

ENTRYPOINT [ "npm","start" ]