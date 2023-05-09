import mongoose from "mongoose";


const { Schema } = mongoose;



const PostSchema = new Schema({
    title: String,
    body: String,
    tags: [String],
    publishedDate : {
        type : Date,
        default: Date.now, //현재 날짜를 기본값으로 지정
    },
    user: {
        _id: mongoose.Types.ObjectId,
        username: String,
    },
    postCount: { 
        type : Number,
        default: 1}
})

const Counter = mongoose.model("Counter", PostSchema);
module.exports = { Counter };
const Post = mongoose.model('Post', PostSchema);
export default Post;

