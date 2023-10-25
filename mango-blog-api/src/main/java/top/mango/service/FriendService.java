package top.mango.service;

import top.mango.entity.Friend;
import top.mango.model.vo.FriendInfo;

import java.util.List;

public interface FriendService {
	List<Friend> getFriendList();

	List<top.mango.model.vo.Friend> getFriendVOList();

	void updateFriendPublishedById(Long friendId, Boolean published);

	void saveFriend(Friend friend);

	void updateFriend(top.mango.model.dto.Friend friend);

	void deleteFriend(Long id);

	void updateViewsByNickname(String nickname);

	FriendInfo getFriendInfo(boolean cache, boolean md);

	void updateFriendInfoContent(String content);

	void updateFriendInfoCommentEnabled(Boolean commentEnabled);
}
