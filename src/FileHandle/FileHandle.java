/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package FileHandle;

import java.util.ArrayList;

/**
 *
 * @author lamng
 */
public interface FileHandle {
    <T> void writeToFile(ArrayList<T> list, String fileName);
    <T> ArrayList<T> readFile(String fileName);
}
