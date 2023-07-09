package FinalExam;

import java.util.*;

public class TempleDoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Integer> tools = new ArrayDeque<>();

        String[] line1 = scan.nextLine().split(" ");

        for (String value : line1) {
            tools.offer(Integer.parseInt(value));
        }


        ArrayDeque<Integer> substances = new ArrayDeque<>();
        String[] line2 = scan.nextLine().split(" ");
        for (int i = 0; i < line2.length; i++) {
            substances.push(Integer.parseInt(line2[i]));
        }

        List<Integer> challenges = new ArrayList<>();
        String[] line3 = scan.nextLine().split(" ");
        for (String s : line3) {
            challenges.add(Integer.parseInt(s));
        }


        while (!challenges.isEmpty() && !tools.isEmpty() && !substances.isEmpty()) {

            int currentTool = tools.poll();
            int currentSubstance = substances.pop();

            int result = currentSubstance * currentTool;

            if (challenges.contains(result)) {
                int indexOf = challenges.indexOf(result);
                challenges.remove(indexOf);
            } else {
                tools.offer(currentTool + 1);
                if (currentSubstance - 1 > 0) {
                    substances.push(currentSubstance - 1);
                }
            }


        }




        if (challenges.isEmpty()) {
            System.out.println("Harry found an ostracon, which is dated to the 6th century BCE.");

            if (!tools.isEmpty()) {
                StringBuilder tooolsbuilder = new StringBuilder();
                for (Integer i : tools) {
                    if (i != tools.peekFirst()) {
                        tooolsbuilder.append(i).append(", ");
                    } else tooolsbuilder.append(i);
                }

                System.out.println("Tools: " + tooolsbuilder);

            }

            if (!substances.isEmpty()) {
                StringBuilder substancesbuilder = new StringBuilder();
                for (Integer i : substances) {
                    if (i != substances.peek()) {
                        substancesbuilder.append(i).append(", ");
                    } else {
                        substancesbuilder.append(i);
                    }
                }

                System.out.println("Substances: " + substancesbuilder);
            }


        } else {
            System.out.println("Harry is lost in the temple. Oblivion awaits him.");
            if (substances.isEmpty()) {
                if (!tools.isEmpty()) {
                    StringBuilder tooolsbuilder = new StringBuilder();
                    for (Integer i : tools) {
                        if (i != tools.peekLast()) {
                            tooolsbuilder.append(i).append(", ");
                        } else tooolsbuilder.append(i);
                    }

                    System.out.println("Tools: " + tooolsbuilder);

                }

                if (!challenges.isEmpty()) {
                    StringBuilder challengebuilder = new StringBuilder();
                    for (Integer i : challenges) {
                        if (!Objects.equals(i, challenges.get(challenges.size() - 1))) {
                            challengebuilder.append(i).append(", ");
                        } else {
                            challengebuilder.append(i);
                        }
                    }

                    System.out.println("Challenges: " + challengebuilder);
                }
            } else {
                StringBuilder substancesbuilder = new StringBuilder();
                for (Integer i : substances) {
                    if (i != substances.peek()) {
                        substancesbuilder.append(i).append(", ");
                    } else {
                        substancesbuilder.append(i);
                    }
                }

                System.out.println("Substances: " + substancesbuilder);


                if (!challenges.isEmpty()) {
                    StringBuilder challengebuilder = new StringBuilder();
                    for (Integer i : challenges) {
                        if (i != challenges.get(challenges.size() - 1)) {
                            challengebuilder.append(i).append(", ");
                        } else {
                            challengebuilder.append(i);
                        }
                    }


                }
            }


        }
    }
}
