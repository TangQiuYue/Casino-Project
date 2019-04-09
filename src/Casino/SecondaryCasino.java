/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casino;

import Player.Player;

/**
 *
 * @author Marie-Eve
 */
public class SecondaryCasino extends Casino {

    //Constructors
    public SecondaryCasino(String name, int maxPlayers) {
        super(name, maxPlayers);
    }

    public SecondaryCasino() {
    }

    public SecondaryCasino(Casino others) {
        super(others);
    }

    //methodes
    public void fireAlarm() {
        int arraySize = this.getCurrentPlayers();
        Player[] playerArray = this.getPlayerArray();
        for (int i = 0; i < arraySize; i++) {
            this.removePlayer(playerArray[0]);
        }
    }

    void mergeSort(Player arrayOfPlayers[], int minSizeArray, int midPointArray, int maxSizeArray) {

        int size1 = midPointArray - minSizeArray + 1;
        int size2 = maxSizeArray - midPointArray;

        Player leftMerge[] = new Player[size1];
        Player rightMerge[] = new Player[size2];
        System.out.println("Start \n");
        printArray();
        for (int i = 0; i < size1; ++i) {
            leftMerge[i] = arrayOfPlayers[minSizeArray + i];
        }
        for (int j = 0; j < size2; ++j) {
            rightMerge[j] = arrayOfPlayers[midPointArray + 1 + j];
        }

        int i = 0, j = 0;

        int k = minSizeArray;
        while (i < size1 && j < size2) {
            if (leftMerge[i].compareTo(rightMerge[j]) == 1) {

                arrayOfPlayers[k] = leftMerge[i];
                i++;
            } else {
                arrayOfPlayers[k] = rightMerge[j];
                j++;
            }
            k++;
        }

        while (i < size1) {
            arrayOfPlayers[k] = leftMerge[i];
            i++;
            k++;
        }

        while (j < size2) {
            arrayOfPlayers[k] = rightMerge[j];
            j++;
            k++;
        }
        System.out.println("End \n");
        printArray();
    }

    void sortBeforeMerge(Player[] arrayOfPlayers, int minSizeArray, int maxSizeArray) {
        if (minSizeArray < maxSizeArray) {
            int midPointArray = (minSizeArray + maxSizeArray) / 2;

            sortBeforeMerge(arrayOfPlayers, minSizeArray, midPointArray);
            sortBeforeMerge(arrayOfPlayers, midPointArray + 1, maxSizeArray);

            mergeSort(arrayOfPlayers, minSizeArray, midPointArray, maxSizeArray);
        }

    }

    public void sortAndBoot(Player[] arrayOfPlayers, int minSizeArray, int maxSizeArray, int bootHowMany) {
        sortBeforeMerge(arrayOfPlayers, minSizeArray, maxSizeArray);
        System.out.println("your sorted player array \n");
        printArray();
        int temp = this.getCurrentPlayers() - 1;
        for (int i = temp; i > temp - bootHowMany; i--) {
            this.removePlayer(arrayOfPlayers[i]);
        }
        System.out.println("your new player array \n");
        printArray();

    }

}
