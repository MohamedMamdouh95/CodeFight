boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
return (friendsRight==yourRight)&&(friendsLeft==yourLeft)||(yourRight==friendsLeft)&&(yourLeft==friendsRight);
}
