package com.mbridge.msdk.playercommon.exoplayer2.text.webvtt;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.ColorParser;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class CssParser {
    private static final String BLOCK_END = "}";
    private static final String BLOCK_START = "{";
    private static final String PROPERTY_BGCOLOR = "background-color";
    private static final String PROPERTY_FONT_FAMILY = "font-family";
    private static final String PROPERTY_FONT_STYLE = "font-style";
    private static final String PROPERTY_FONT_WEIGHT = "font-weight";
    private static final String PROPERTY_TEXT_DECORATION = "text-decoration";
    private static final String VALUE_BOLD = "bold";
    private static final String VALUE_ITALIC = "italic";
    private static final String VALUE_UNDERLINE = "underline";
    private static final Pattern VOICE_NAME_PATTERN = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private final ParsableByteArray styleInput = new ParsableByteArray();
    private final StringBuilder stringBuilder = new StringBuilder();

    private void applySelectorToStyle(WebvttCssStyle webvttCssStyle, String str) {
        if ("".equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = VOICE_NAME_PATTERN.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                webvttCssStyle.setTargetVoice(matcher.group(1));
            }
            str = str.substring(0, indexOf);
        }
        String[] split = Util.split(str, "\\.");
        String str2 = split[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            webvttCssStyle.setTargetTagName(str2.substring(0, indexOf2));
            webvttCssStyle.setTargetId(str2.substring(indexOf2 + 1));
        } else {
            webvttCssStyle.setTargetTagName(str2);
        }
        if (split.length > 1) {
            webvttCssStyle.setTargetClasses((String[]) Arrays.copyOfRange(split, 1, split.length));
        }
    }

    private static boolean maybeSkipComment(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        byte[] bArr = parsableByteArray.data;
        if (position + 2 <= limit) {
            int i9 = position + 1;
            if (bArr[position] == 47) {
                int i10 = position + 2;
                if (bArr[i9] != 42) {
                    return false;
                }
                while (true) {
                    int i11 = i10 + 1;
                    if (i11 < limit) {
                        if (((char) bArr[i10]) == '*' && ((char) bArr[i11]) == '/') {
                            i10 += 2;
                            limit = i10;
                        } else {
                            i10 = i11;
                        }
                    } else {
                        parsableByteArray.skipBytes(limit - parsableByteArray.getPosition());
                        return true;
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private static boolean maybeSkipWhitespace(ParsableByteArray parsableByteArray) {
        char peekCharAtPosition = peekCharAtPosition(parsableByteArray, parsableByteArray.getPosition());
        if (peekCharAtPosition != '\t' && peekCharAtPosition != '\n' && peekCharAtPosition != '\f' && peekCharAtPosition != '\r' && peekCharAtPosition != ' ') {
            return false;
        }
        parsableByteArray.skipBytes(1);
        return true;
    }

    private static String parseIdentifier(ParsableByteArray parsableByteArray, StringBuilder sb) {
        boolean z8 = false;
        sb.setLength(0);
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        while (position < limit && !z8) {
            char c9 = (char) parsableByteArray.data[position];
            if ((c9 < 'A' || c9 > 'Z') && ((c9 < 'a' || c9 > 'z') && ((c9 < '0' || c9 > '9') && c9 != '#' && c9 != '-' && c9 != '.' && c9 != '_'))) {
                z8 = true;
            } else {
                position++;
                sb.append(c9);
            }
        }
        parsableByteArray.skipBytes(position - parsableByteArray.getPosition());
        return sb.toString();
    }

    public static String parseNextToken(ParsableByteArray parsableByteArray, StringBuilder sb) {
        skipWhitespaceAndComments(parsableByteArray);
        if (parsableByteArray.bytesLeft() == 0) {
            return null;
        }
        String parseIdentifier = parseIdentifier(parsableByteArray, sb);
        if (!"".equals(parseIdentifier)) {
            return parseIdentifier;
        }
        return "" + ((char) parsableByteArray.readUnsignedByte());
    }

    private static String parsePropertyValue(ParsableByteArray parsableByteArray, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z8 = false;
        while (!z8) {
            int position = parsableByteArray.getPosition();
            String parseNextToken = parseNextToken(parsableByteArray, sb);
            if (parseNextToken == null) {
                return null;
            }
            if (!BLOCK_END.equals(parseNextToken) && !";".equals(parseNextToken)) {
                sb2.append(parseNextToken);
            } else {
                parsableByteArray.setPosition(position);
                z8 = true;
            }
        }
        return sb2.toString();
    }

    private static String parseSelector(ParsableByteArray parsableByteArray, StringBuilder sb) {
        String str;
        skipWhitespaceAndComments(parsableByteArray);
        if (parsableByteArray.bytesLeft() < 5 || !"::cue".equals(parsableByteArray.readString(5))) {
            return null;
        }
        int position = parsableByteArray.getPosition();
        String parseNextToken = parseNextToken(parsableByteArray, sb);
        if (parseNextToken == null) {
            return null;
        }
        if (BLOCK_START.equals(parseNextToken)) {
            parsableByteArray.setPosition(position);
            return "";
        }
        if ("(".equals(parseNextToken)) {
            str = readCueTarget(parsableByteArray);
        } else {
            str = null;
        }
        String parseNextToken2 = parseNextToken(parsableByteArray, sb);
        if (!")".equals(parseNextToken2) || parseNextToken2 == null) {
            return null;
        }
        return str;
    }

    private static void parseStyleDeclaration(ParsableByteArray parsableByteArray, WebvttCssStyle webvttCssStyle, StringBuilder sb) {
        skipWhitespaceAndComments(parsableByteArray);
        String parseIdentifier = parseIdentifier(parsableByteArray, sb);
        if ("".equals(parseIdentifier) || !":".equals(parseNextToken(parsableByteArray, sb))) {
            return;
        }
        skipWhitespaceAndComments(parsableByteArray);
        String parsePropertyValue = parsePropertyValue(parsableByteArray, sb);
        if (parsePropertyValue != null && !"".equals(parsePropertyValue)) {
            int position = parsableByteArray.getPosition();
            String parseNextToken = parseNextToken(parsableByteArray, sb);
            if (!";".equals(parseNextToken)) {
                if (BLOCK_END.equals(parseNextToken)) {
                    parsableByteArray.setPosition(position);
                } else {
                    return;
                }
            }
            if (TtmlNode.ATTR_TTS_COLOR.equals(parseIdentifier)) {
                webvttCssStyle.setFontColor(ColorParser.parseCssColor(parsePropertyValue));
                return;
            }
            if (PROPERTY_BGCOLOR.equals(parseIdentifier)) {
                webvttCssStyle.setBackgroundColor(ColorParser.parseCssColor(parsePropertyValue));
                return;
            }
            if (PROPERTY_TEXT_DECORATION.equals(parseIdentifier)) {
                if ("underline".equals(parsePropertyValue)) {
                    webvttCssStyle.setUnderline(true);
                }
            } else {
                if (PROPERTY_FONT_FAMILY.equals(parseIdentifier)) {
                    webvttCssStyle.setFontFamily(parsePropertyValue);
                    return;
                }
                if (PROPERTY_FONT_WEIGHT.equals(parseIdentifier)) {
                    if ("bold".equals(parsePropertyValue)) {
                        webvttCssStyle.setBold(true);
                    }
                } else if (PROPERTY_FONT_STYLE.equals(parseIdentifier) && "italic".equals(parsePropertyValue)) {
                    webvttCssStyle.setItalic(true);
                }
            }
        }
    }

    private static char peekCharAtPosition(ParsableByteArray parsableByteArray, int i9) {
        return (char) parsableByteArray.data[i9];
    }

    private static String readCueTarget(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        boolean z8 = false;
        while (position < limit && !z8) {
            int i9 = position + 1;
            if (((char) parsableByteArray.data[position]) == ')') {
                z8 = true;
            } else {
                z8 = false;
            }
            position = i9;
        }
        return parsableByteArray.readString((position - 1) - parsableByteArray.getPosition()).trim();
    }

    public static void skipStyleBlock(ParsableByteArray parsableByteArray) {
        do {
        } while (!TextUtils.isEmpty(parsableByteArray.readLine()));
    }

    public static void skipWhitespaceAndComments(ParsableByteArray parsableByteArray) {
        while (true) {
            for (boolean z8 = true; parsableByteArray.bytesLeft() > 0 && z8; z8 = false) {
                if (!maybeSkipWhitespace(parsableByteArray) && !maybeSkipComment(parsableByteArray)) {
                }
            }
            return;
        }
    }

    public final WebvttCssStyle parseBlock(ParsableByteArray parsableByteArray) {
        boolean z8;
        this.stringBuilder.setLength(0);
        int position = parsableByteArray.getPosition();
        skipStyleBlock(parsableByteArray);
        this.styleInput.reset(parsableByteArray.data, parsableByteArray.getPosition());
        this.styleInput.setPosition(position);
        String parseSelector = parseSelector(this.styleInput, this.stringBuilder);
        if (parseSelector == null || !BLOCK_START.equals(parseNextToken(this.styleInput, this.stringBuilder))) {
            return null;
        }
        WebvttCssStyle webvttCssStyle = new WebvttCssStyle();
        applySelectorToStyle(webvttCssStyle, parseSelector);
        String str = null;
        boolean z9 = false;
        while (!z9) {
            int position2 = this.styleInput.getPosition();
            str = parseNextToken(this.styleInput, this.stringBuilder);
            if (str != null && !BLOCK_END.equals(str)) {
                z8 = false;
            } else {
                z8 = true;
            }
            if (!z8) {
                this.styleInput.setPosition(position2);
                parseStyleDeclaration(this.styleInput, webvttCssStyle, this.stringBuilder);
            }
            z9 = z8;
        }
        if (!BLOCK_END.equals(str)) {
            return null;
        }
        return webvttCssStyle;
    }
}
