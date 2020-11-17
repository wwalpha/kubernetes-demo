FROM node:12.19.1-alpine

WORKDIR /usr/local/src

COPY . .

RUN yarn global add typescript ts-node
RUN yarn install

EXPOSE 8080

ENTRYPOINT [ "npm","start" ]