FROM node:10

# Create app directory
WORKDIR /usr/src/app

COPY ./src ./

RUN npm install
# If you are building your code for production
# RUN npm ci --only=production

EXPOSE 3000
#CMD [ "npm", "start" ]
CMD [ "gulp" ]
