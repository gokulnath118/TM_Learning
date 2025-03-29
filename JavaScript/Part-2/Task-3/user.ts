export interface User {
    username: string;
    age: number;
    email: string;
  }
  
export function createUser(username: string, age: number, email: string): User {
    return { username, age, email };
}
  