import { createUser } from "./user.js";

const userObj = createUser("Franklin", 20, "franklin@mail.com");
console.log(`User: ${userObj.username}, Age: ${userObj.age}, Email: ${userObj.email}`);
