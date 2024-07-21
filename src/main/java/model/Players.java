package model;

import java.util.List;

public class Players {

    private List<String> playerNames;

    public Players(List<String> playerNames) {
        if (playerNames.stream().distinct().count() != playerNames.size()) {
            throw new IllegalArgumentException("중복된 플레이어 이름이 존재합니다.");
        }
        if (playerNames.contains("all")) {
            throw new IllegalArgumentException("플레이어 이름은 all이 될 수 없습니다.");
        }
        this.playerNames = playerNames;
    }

    public Integer getPlayerCount() {
        return playerNames.size();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String playerName : playerNames) {
            stringBuilder.append(playerName);
            stringBuilder.append("\t");
        }
        return stringBuilder.toString();
    }

}
