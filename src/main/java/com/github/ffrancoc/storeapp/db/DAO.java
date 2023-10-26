/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.ffrancoc.storeapp.db;

import java.util.ArrayList;

/**
 *
 * @author niruc
 */
public abstract class DAO {

    public abstract Object getItem(Integer id);

    public abstract ArrayList<?> getItems();
}
