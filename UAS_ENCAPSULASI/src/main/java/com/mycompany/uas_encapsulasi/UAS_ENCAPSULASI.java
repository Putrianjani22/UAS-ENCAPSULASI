/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uas_encapsulasi;

/**
 *
 * @author User
 */
public class UAS_ENCAPSULASI {

    public static void main(String[] args) {
        MAHASISWA m = new MAHASISWA();
        m.setnama("PUTRI ANJANI");
        m.setjurusan("REKAYASA PERANGKAT LUNAK");
        m.setmatkul("PEMROGRAMAN BERORIENTASI OBJEK");
        m.setnim("21090089");
        
        System.out.println("Nama    : "+m.getnama());
        System.out.println("Jurusan : "+m.getjurusan());
        System.out.println("Matkul  : "+m.getmatkul());
        System.out.println("Nim     : "+m.getnim());
           
    }

    }

