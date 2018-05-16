/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.tartarus.snowball.ext;

/**
 *
 * @author Paul Wolfgang
 */
public class noStemmer extends org.tartarus.snowball.javastemmers.SnowballStemmer {
    @Override
    public boolean stem() { return true; }

}
