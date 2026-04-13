package app;

public class Helper {
  public static String indentEachLine(String s) {
    String[] lines = s.split("\n");
    StringBuilder sb = new StringBuilder();
    for (String line : lines) {
      sb.append("  ").append(line).append("\n");
    }
    sb.deleteCharAt(sb.length() - 1);
    return sb.toString();
  }
}