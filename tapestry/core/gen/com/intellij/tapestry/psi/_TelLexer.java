/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

/* It's an automatically generated code. Do not modify it. */
package com.intellij.tapestry.psi;

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.lexer.FlexLexer;
import static com.intellij.tapestry.psi.TelTokenTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>_TelLexer.flex</tt>
 */
class _TelLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int TEL = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [12, 6, 3]
   * Total runtime size is 15328 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>9]<<6)|((ch>>3)&0x3f)]<<3)|(ch&0x7)];
  }

  /* The ZZ_CMAP_Z table has 2176 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
    "\20\5\21\1\22\1\23\1\24\1\21\14\25\1\26\50\25\1\27\2\25\1\30\1\31\1\32\1\33"+
    "\25\25\1\34\20\21\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\21\1\44\1\45\1\46\1"+
    "\21\1\47\1\50\1\51\1\52\1\53\3\21\1\25\1\54\1\55\5\21\2\25\1\56\31\21\1\25"+
    "\1\57\1\21\1\60\40\21\1\61\17\21\1\62\1\63\1\64\1\65\13\21\1\66\10\21\123"+
    "\25\1\67\7\25\1\70\1\71\37\21\1\25\1\71\u0582\21\1\72\u017f\21");

  /* The ZZ_CMAP_Y table has 3776 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\0\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\7\1\10\1\11\1\13\4\0"+
    "\1\14\1\15\1\16\1\17\2\20\1\21\3\20\1\21\71\20\1\22\1\20\1\23\1\24\1\25\1"+
    "\26\2\24\16\0\1\27\1\14\1\30\1\31\2\20\1\32\11\20\1\33\21\20\1\34\1\35\23"+
    "\20\1\24\1\36\3\20\1\21\1\37\1\36\4\20\1\40\1\41\4\0\1\42\1\43\1\24\3\20\2"+
    "\44\1\24\1\45\1\46\1\0\1\47\5\20\1\50\2\0\1\5\1\51\1\52\13\20\1\53\1\42\1"+
    "\54\1\55\1\5\1\56\1\24\1\57\1\60\3\20\3\0\1\61\12\20\1\62\1\0\1\63\1\24\1"+
    "\5\1\64\3\20\1\50\1\65\1\17\2\20\1\62\1\66\1\67\1\70\2\24\3\20\1\71\10\24"+
    "\1\72\1\25\6\24\1\73\2\0\1\74\1\75\6\20\1\76\2\0\1\77\1\20\1\100\1\5\2\36"+
    "\1\101\1\102\1\103\2\20\1\72\1\104\1\105\1\106\1\107\1\57\1\110\1\100\1\5"+
    "\1\111\1\46\1\101\1\112\1\103\2\20\1\72\1\113\1\114\1\115\1\116\1\117\1\120"+
    "\1\121\1\5\1\122\1\24\1\101\1\33\1\32\2\20\1\72\1\123\1\105\1\42\1\124\1\125"+
    "\1\24\1\100\1\5\1\37\1\24\1\101\1\102\1\103\2\20\1\72\1\123\1\105\1\106\1"+
    "\116\1\126\1\110\1\100\1\5\1\37\1\24\1\127\1\130\1\131\1\132\1\133\1\130\1"+
    "\20\1\134\1\135\1\136\1\137\1\24\1\121\1\5\1\24\1\37\1\101\1\27\1\72\2\20"+
    "\1\72\1\140\1\141\1\142\1\136\1\143\1\23\1\100\1\5\2\24\1\144\1\27\1\72\2"+
    "\20\1\72\1\140\1\105\1\142\1\136\1\143\1\30\1\100\1\5\1\145\1\24\1\144\1\27"+
    "\1\72\4\20\1\146\1\142\1\147\1\57\1\24\1\100\1\5\1\24\1\35\1\144\1\20\1\21"+
    "\1\35\2\20\1\32\1\150\1\21\1\151\1\152\1\0\1\153\1\154\1\155\1\24\1\36\5\20"+
    "\1\156\1\157\1\160\1\74\1\5\1\161\4\24\1\162\1\163\1\164\1\36\1\165\1\166"+
    "\1\156\1\167\1\170\1\171\1\5\1\172\4\24\1\125\2\24\1\173\1\5\1\161\1\174\1"+
    "\175\1\20\1\36\3\20\1\25\1\41\1\0\1\142\1\176\1\0\1\41\3\0\1\45\1\177\7\24"+
    "\5\20\1\50\1\0\1\200\1\5\1\161\1\62\1\201\1\202\1\203\1\204\1\20\1\205\1\206"+
    "\1\5\1\207\4\20\1\33\1\16\5\20\1\210\51\20\1\131\1\21\1\131\5\20\1\131\4\20"+
    "\1\131\1\21\1\131\1\20\1\21\7\20\1\131\10\20\1\211\4\24\2\20\2\24\12\20\1"+
    "\25\1\24\1\36\114\20\1\102\2\20\1\36\2\20\1\44\11\20\1\130\1\125\1\24\1\20"+
    "\1\27\1\212\1\24\2\20\1\212\1\24\2\20\1\213\1\24\1\20\1\27\1\214\1\24\6\20"+
    "\1\215\3\0\1\216\1\217\1\5\1\161\3\24\1\220\1\5\1\161\13\20\1\24\5\20\1\221"+
    "\10\20\1\222\1\24\3\20\1\25\1\0\1\2\1\0\1\2\1\121\1\5\3\20\1\222\1\25\1\24"+
    "\5\20\1\111\2\0\1\52\1\173\1\5\1\161\4\24\2\20\1\160\1\2\6\20\1\176\1\74\3"+
    "\0\1\106\1\5\1\161\1\5\1\161\1\40\13\24\1\223\5\20\1\215\1\0\1\223\1\111\1"+
    "\5\1\161\1\24\1\224\1\2\1\24\1\225\3\20\1\77\1\203\1\5\1\64\4\20\1\62\1\0"+
    "\1\2\1\24\4\20\1\215\2\0\1\24\1\5\1\226\1\5\1\64\3\20\1\222\12\24\1\227\2"+
    "\0\1\230\1\231\1\24\30\20\4\0\1\74\2\24\1\73\42\20\2\222\4\20\2\222\1\20\1"+
    "\232\3\20\1\222\6\20\1\27\1\170\1\233\1\25\1\234\1\111\1\20\1\25\1\233\1\25"+
    "\1\24\1\224\3\24\1\235\1\24\1\40\1\125\1\24\1\236\1\24\1\45\1\237\1\37\1\40"+
    "\2\24\1\20\1\25\3\20\1\44\2\24\1\0\1\45\1\240\1\0\1\241\1\24\1\242\1\35\1"+
    "\150\1\243\1\26\1\244\1\20\1\245\1\246\1\247\2\24\5\20\1\125\116\24\5\20\1"+
    "\21\5\20\1\21\20\20\1\25\1\250\1\251\1\24\4\20\1\33\1\16\7\20\1\40\1\24\1"+
    "\57\2\20\1\21\1\24\10\21\4\0\5\24\1\40\72\24\1\246\3\24\1\36\1\205\1\243\1"+
    "\25\1\36\11\20\1\21\1\252\1\36\12\20\1\210\1\246\4\20\1\222\1\36\12\20\1\21"+
    "\2\24\3\20\1\44\6\24\170\20\1\222\11\24\71\20\1\25\6\24\21\20\1\25\10\24\5"+
    "\20\1\222\41\20\1\25\2\20\1\5\1\253\2\24\5\20\1\160\1\73\1\254\3\20\1\57\12"+
    "\20\1\173\3\24\1\40\1\20\1\35\14\20\1\255\1\111\1\24\1\20\1\44\11\24\1\20"+
    "\1\256\1\257\2\20\1\50\2\24\1\125\6\20\1\111\1\24\1\260\5\20\1\215\1\0\1\45"+
    "\1\24\1\5\1\161\2\0\1\260\1\46\1\5\1\64\2\20\1\62\1\171\2\20\1\160\1\0\1\2"+
    "\1\24\3\20\1\25\1\75\5\20\1\50\1\0\1\241\1\40\1\5\1\161\2\24\1\154\1\261\5"+
    "\20\1\77\1\74\1\24\1\257\1\262\1\5\1\161\2\20\1\21\1\263\6\20\1\202\1\264"+
    "\1\221\2\24\1\265\1\20\1\50\1\266\1\24\3\267\1\24\2\21\22\24\4\20\1\50\1\270"+
    "\1\5\1\161\64\20\1\111\1\24\2\20\1\21\1\271\5\20\1\111\40\24\55\20\1\222\15"+
    "\20\1\23\4\24\1\21\1\24\1\271\1\272\1\20\1\72\1\21\1\170\1\273\15\20\1\23"+
    "\3\24\1\271\54\20\1\222\2\24\10\20\1\35\6\20\5\24\1\20\1\25\2\0\2\24\1\74"+
    "\1\24\1\133\2\24\1\246\3\24\1\37\1\27\20\20\1\274\1\236\1\24\1\5\1\161\1\36"+
    "\2\20\1\112\1\36\2\20\1\44\1\275\12\20\1\21\3\35\1\276\1\277\2\24\1\300\1"+
    "\20\1\140\2\20\1\21\2\20\1\301\1\20\1\222\1\20\1\222\4\24\17\20\1\44\10\24"+
    "\6\20\1\25\20\24\1\302\20\24\3\20\1\25\6\20\1\125\5\24\3\20\1\21\2\24\3\20"+
    "\1\44\6\24\3\20\1\222\4\20\1\111\1\20\1\243\5\24\23\20\1\222\1\5\1\161\52"+
    "\24\1\222\1\72\4\20\1\33\1\303\2\20\1\222\25\24\2\20\1\222\1\24\3\20\1\23"+
    "\10\24\7\20\1\275\10\24\1\304\1\73\1\140\1\36\2\20\1\111\1\115\4\24\3\20\1"+
    "\25\20\24\6\20\1\222\1\24\2\20\1\222\1\24\2\20\1\44\21\24\11\20\1\125\66\24"+
    "\1\225\6\20\1\0\1\74\3\24\1\121\1\5\2\24\1\225\5\20\1\0\1\305\2\24\3\20\1"+
    "\125\1\5\1\161\1\225\3\20\1\160\1\0\1\306\1\5\10\24\1\225\5\20\1\50\1\0\1"+
    "\307\1\24\1\5\1\161\42\24\1\154\1\261\72\24\1\154\1\261\56\24\1\154\1\261"+
    "\4\24\5\20\1\50\1\0\1\24\1\5\1\161\14\24\1\154\1\261\64\24\1\154\1\261\42"+
    "\24\55\20\1\21\22\24\14\20\1\44\63\24\5\20\1\21\72\24\7\20\1\125\4\24\1\154"+
    "\1\261\34\24\1\154\1\261\64\24\10\20\1\25\1\24\1\77\4\0\1\74\1\24\1\57\1\225"+
    "\1\20\14\24\1\23\153\24\1\310\1\311\2\0\1\312\1\2\3\24\1\313\22\24\1\314\67"+
    "\24\12\20\1\27\10\20\1\27\1\315\1\316\1\20\1\317\1\140\7\20\1\33\1\320\2\27"+
    "\3\20\1\321\1\170\1\35\1\72\51\20\1\222\3\20\1\72\2\20\1\210\3\20\1\210\2"+
    "\20\1\27\3\20\1\27\2\20\1\21\3\20\1\21\3\20\1\72\3\20\1\72\2\20\1\210\1\322"+
    "\6\5\1\140\3\20\1\162\1\36\1\210\1\323\1\242\1\324\1\162\1\232\1\162\2\210"+
    "\1\120\1\20\1\32\1\20\1\111\1\325\1\32\1\20\1\111\50\24\32\20\1\21\5\24\106"+
    "\20\1\25\1\24\33\20\1\222\74\24\1\117\3\24\14\0\20\24\36\0\2\24");

  /* The ZZ_CMAP_A table has 1712 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\2\2\10\1\0\2\10\6\2\4\0\1\10\1\26\2\0\1\34\2\0\1\33\1\27\1\30\1\0\1\7"+
    "\1\25\1\3\1\6\1\0\12\5\1\23\4\0\1\24\1\0\1\13\3\1\1\16\1\12\5\1\1\14\1\1\1"+
    "\22\3\1\1\20\1\15\1\17\1\21\5\1\1\31\1\0\1\32\1\0\4\1\1\35\1\0\1\11\1\0\1"+
    "\2\2\0\4\1\4\0\1\1\2\0\1\2\7\0\1\1\4\0\1\1\5\0\17\1\1\0\2\1\4\0\4\1\16\0\5"+
    "\1\7\0\1\1\1\0\1\1\1\0\5\1\1\0\2\1\6\0\1\1\1\0\3\1\1\0\1\1\1\0\4\1\1\0\13"+
    "\1\1\0\3\1\1\0\5\2\2\0\6\1\1\0\7\1\1\0\1\1\15\0\1\1\1\0\15\2\1\0\1\2\1\0\2"+
    "\2\1\0\2\2\1\0\1\2\3\1\5\0\5\2\6\0\1\1\4\0\3\2\5\0\3\1\5\2\2\5\4\0\2\1\1\2"+
    "\13\1\1\0\1\1\7\2\2\1\2\2\1\0\4\2\2\1\2\5\3\1\2\0\1\1\7\0\1\2\1\1\1\2\6\1"+
    "\3\2\2\0\11\1\3\2\1\1\6\0\2\5\6\1\4\2\2\1\2\0\2\2\1\1\11\2\1\1\3\2\1\1\5\2"+
    "\2\0\1\1\3\2\4\0\1\1\1\0\6\1\4\0\13\2\1\0\4\2\6\1\3\2\1\1\2\2\1\1\7\2\2\1"+
    "\2\2\2\0\2\5\1\0\3\2\1\0\10\1\2\0\2\1\2\0\6\1\1\0\1\1\3\0\4\1\2\0\1\2\1\1"+
    "\7\2\2\0\2\2\2\0\3\2\1\1\5\0\2\1\1\0\5\1\4\0\3\1\4\0\2\1\1\0\2\1\1\0\2\1\1"+
    "\0\2\1\2\0\1\2\1\0\5\2\4\0\2\2\2\0\3\2\3\0\1\2\7\0\4\1\1\0\1\1\7\0\2\5\2\2"+
    "\3\1\1\2\2\0\1\1\1\0\2\1\1\0\3\1\2\2\1\0\3\2\2\0\1\1\15\0\2\2\2\0\1\2\1\1"+
    "\1\0\6\1\3\0\3\1\1\0\4\1\3\0\2\1\1\0\1\1\1\0\2\1\3\0\2\1\3\0\2\1\4\0\5\2\3"+
    "\0\3\2\1\0\4\2\2\0\1\1\6\0\1\2\4\1\1\0\5\1\3\0\1\1\7\2\1\0\2\2\5\0\2\2\3\0"+
    "\2\2\1\0\3\1\1\0\2\1\5\0\3\1\2\0\1\1\3\2\1\0\4\2\1\1\1\0\4\1\1\0\1\1\4\0\1"+
    "\2\4\0\6\2\1\0\1\2\7\0\12\4\2\0\2\2\4\0\1\1\1\2\2\1\7\2\4\0\10\1\1\2\2\5\7"+
    "\0\2\1\1\0\1\1\2\0\2\1\1\0\1\1\2\0\1\1\6\0\4\1\1\0\3\1\1\0\1\1\1\0\1\1\2\0"+
    "\2\1\1\0\3\1\2\2\1\0\2\2\1\1\2\0\5\1\1\0\1\1\1\0\6\2\2\0\2\5\2\0\4\1\2\2\13"+
    "\0\1\2\1\0\1\2\1\0\1\2\4\0\2\2\5\1\3\2\6\0\1\2\1\0\7\2\1\1\2\2\4\1\3\2\1\1"+
    "\3\2\2\1\7\2\3\1\4\2\5\1\14\2\1\1\1\2\2\5\4\2\2\0\3\1\1\0\7\1\2\0\3\2\2\1"+
    "\3\2\3\0\2\1\2\2\4\0\1\1\1\0\2\2\4\0\4\1\10\2\3\0\1\1\3\0\2\1\1\2\5\0\3\2"+
    "\2\0\1\1\1\2\1\1\5\0\6\1\2\0\5\2\3\1\3\0\10\2\5\1\2\5\3\0\3\1\3\2\1\0\5\2"+
    "\4\1\1\2\4\1\3\2\2\1\2\0\1\1\1\0\1\1\1\0\1\1\1\0\1\1\2\0\3\1\1\0\6\1\2\0\2"+
    "\1\2\0\5\2\5\0\1\1\5\0\6\2\1\0\1\2\3\0\4\2\11\0\1\1\4\0\1\1\1\0\5\1\2\0\1"+
    "\1\1\0\4\1\1\0\3\1\2\0\4\1\5\0\5\1\4\0\1\1\4\0\4\1\3\2\2\1\5\0\2\2\2\0\3\1"+
    "\2\5\2\1\4\0\6\2\1\0\2\1\2\0\4\1\1\0\2\1\1\2\3\1\1\2\4\1\1\2\4\1\2\2\6\1\2"+
    "\4\6\0\4\1\2\2\4\0\1\1\1\2\4\0\1\2\5\1\2\2\3\0\3\1\4\0\3\1\2\2\2\0\6\1\1\0"+
    "\3\2\1\0\2\2\5\0\5\1\5\0\1\1\1\2\3\1\1\0\2\1\1\0\7\1\2\0\1\2\6\0\2\1\2\0\3"+
    "\1\3\0\2\1\3\0\2\1\2\0\3\2\4\0\3\1\1\0\2\1\1\0\1\1\5\0\1\2\2\0\1\1\3\0\1\1"+
    "\2\0\2\1\3\2\1\0\2\2\1\0\3\2\2\0\1\2\2\0\5\2\1\0\2\5\1\2\4\1\10\0\5\2\3\0"+
    "\6\2\2\0\3\2\2\0\4\2\4\0\3\2\5\0\1\1\2\0\2\1\2\0\4\1\1\0\4\1\1\0\1\1\1\0\6"+
    "\1\2\0\5\1\1\0\4\1\1\0\4\1\2\0\2\5\1\0\1\1\1\0\1\1\5\0\1\1\1\0\1\1\1\0\3\1"+
    "\1\0\3\1\1\0\3\1");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\2\1\1\2\1\3\1\2\1\4\1\5\1\6"+
    "\1\7\3\3\1\10\1\2\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\2\1\17\4\0\1\20\1\21\3\3"+
    "\1\22\1\0\1\23\1\0\3\3\1\24\1\25";

  private static int [] zzUnpackAction() {
    int [] result = new int[42];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\36\0\74\0\132\0\74\0\170\0\226\0\264"+
    "\0\322\0\360\0\74\0\u010e\0\u012c\0\u014a\0\74\0\u0168"+
    "\0\74\0\74\0\74\0\74\0\74\0\74\0\u0186\0\74"+
    "\0\u01a4\0\u01c2\0\u01e0\0\u01fe\0\u01fe\0\74\0\u021c\0\u023a"+
    "\0\u0258\0\74\0\u0186\0\74\0\u0276\0\u0294\0\u02b2\0\u02d0"+
    "\0\170\0\170";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[42];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\34\3\1\4\1\3\1\5\1\6\1\5\1\7\2\10"+
    "\1\11\1\7\1\12\1\13\1\14\4\6\1\15\2\6"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\6\1\5\73\0\1\30\1\0\2\6"+
    "\1\31\1\0\1\6\4\0\11\6\11\0\1\6\4\0"+
    "\1\32\2\10\1\33\1\32\32\0\2\10\1\33\32\0"+
    "\1\34\2\35\1\36\1\34\36\0\1\12\26\0\2\6"+
    "\1\31\1\0\1\6\4\0\1\6\1\37\7\6\11\0"+
    "\1\6\2\0\2\6\1\31\1\0\1\6\4\0\6\6"+
    "\1\40\2\6\11\0\1\6\2\0\2\6\1\31\1\0"+
    "\1\6\4\0\7\6\1\41\1\6\11\0\1\6\7\0"+
    "\1\42\27\0\33\43\1\44\2\43\1\0\2\6\2\0"+
    "\1\6\4\0\11\6\11\0\1\6\5\0\2\45\33\0"+
    "\1\34\2\35\1\0\1\34\32\0\2\35\31\0\2\6"+
    "\1\31\1\0\1\6\4\0\2\6\1\46\6\6\11\0"+
    "\1\6\2\0\2\6\1\31\1\0\1\6\4\0\7\6"+
    "\1\47\1\6\11\0\1\6\2\0\2\6\1\31\1\0"+
    "\1\6\4\0\2\6\1\50\6\6\11\0\1\6\5\0"+
    "\2\45\1\33\30\0\2\6\1\31\1\0\1\6\4\0"+
    "\3\6\1\47\5\6\11\0\1\6\2\0\2\6\1\31"+
    "\1\0\1\6\4\0\4\6\1\51\4\6\11\0\1\6"+
    "\2\0\2\6\1\31\1\0\1\6\4\0\2\6\1\52"+
    "\6\6\11\0\1\6\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[750];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\1\1\1\11\5\1\1\11\3\1\1\11"+
    "\1\1\6\11\1\1\1\11\4\0\1\1\1\11\3\1"+
    "\1\11\1\0\1\11\1\0\5\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[42];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
   public _TelLexer() {
     this((java.io.Reader)null);
   }
 
   private void resetAll() {
   }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  _TelLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return TokenType.BAD_CHARACTER;
            }
          case 22: break;
          case 2: 
            { return TAP5_EL_BAD_CHAR;
            }
          case 23: break;
          case 3: 
            { return TAP5_EL_IDENTIFIER;
            }
          case 24: break;
          case 4: 
            { return TAP5_EL_INTEGER;
            }
          case 25: break;
          case 5: 
            { return TAP5_EL_DOT;
            }
          case 26: break;
          case 6: 
            { return TokenType.WHITE_SPACE;
            }
          case 27: break;
          case 7: 
            { yybegin(YYINITIAL); return TAP5_EL_END;
            }
          case 28: break;
          case 8: 
            { return TAP5_EL_COLON;
            }
          case 29: break;
          case 9: 
            { return TAP5_EL_COMMA;
            }
          case 30: break;
          case 10: 
            { return TAP5_EL_EXCLAMATION;
            }
          case 31: break;
          case 11: 
            { return TAP5_EL_LEFT_PARENTH;
            }
          case 32: break;
          case 12: 
            { return TAP5_EL_RIGHT_PARENTH;
            }
          case 33: break;
          case 13: 
            { return TAP5_EL_LEFT_BRACKET;
            }
          case 34: break;
          case 14: 
            { return TAP5_EL_RIGHT_BRACKET;
            }
          case 35: break;
          case 15: 
            { yybegin(TEL); return TAP5_EL_START;
            }
          case 36: break;
          case 16: 
            { return TAP5_EL_DECIMAL;
            }
          case 37: break;
          case 17: 
            { return TAP5_EL_RANGE;
            }
          case 38: break;
          case 18: 
            { return TAP5_EL_QUESTION_DOT;
            }
          case 39: break;
          case 19: 
            { return TAP5_EL_STRING;
            }
          case 40: break;
          case 20: 
            { return TAP5_EL_BOOLEAN;
            }
          case 41: break;
          case 21: 
            { return TAP5_EL_NULL;
            }
          case 42: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}