// Sample task array
const tasks = [
    { name: "Complete Project", isCompleted: true, dueDate: "2025-03-30" },
    { name: "Paper Publication", isCompleted: false, dueDate: "2025-04-01" },
    { name: "Project review", isCompleted: false, dueDate: "2025-04-10" },
    { name: "Submit report", isCompleted: false, dueDate: "2025-03-25" }
];

// Get today's date in YYYY-MM-DD format
const today = new Date().toISOString().split("T")[0];

// Function to get incomplete tasks
const getIncompleteTasks = (taskList) => taskList.filter(task => !task.isCompleted);

// Function to get overdue tasks
const overdueTasks = (taskList) => taskList.filter(task => !task.isCompleted && task.dueDate < today);

// Count total and completed tasks
const totalTasks = () => tasks.length;
const completedTaskCount = () => tasks.filter(task => task.isCompleted).length;

// Log output to console
console.log("Incomplete Tasks:", getIncompleteTasks(tasks));
console.log("Overdue Tasks:", overdueTasks(tasks));
console.log("Total Tasks:", totalTasks());
console.log("Completed Tasks:", completedTaskCount());
