package kotlinx.serialization.json.internal;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.a;
import eb.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import vd.e;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\r\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0004H\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0014J\b\u0010\u001f\u001a\u00020 H&J\u0006\u0010!\u001a\u00020 J\u0010\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0004H\u0003J\u0006\u0010#\u001a\u00020 J\u0018\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\b\u0010&\u001a\u00020\u000fH&J\u001a\u0010'\u001a\u0004\u0018\u00010\u000f2\u0006\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020 H&J\b\u0010*\u001a\u00020+H&J\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+J\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-H\u0016J\u0006\u0010.\u001a\u00020/J\u0006\u00100\u001a\u00020\u000fJ \u00100\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0005J\u0006\u00101\u001a\u00020\u000fJ\u0006\u00102\u001a\u00020\u000fJ\u0018\u00103\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u00104\u001a\u00020\u001cH\u0016J\u0006\u00105\u001a\u00020\u001cJ\u0015\u00106\u001a\u0002072\u0006\u00108\u001a\u00020+H\u0000¢\u0006\u0002\b9J\"\u00106\u001a\u0002072\u0006\u0010:\u001a\u00020\u000f2\b\b\u0002\u0010;\u001a\u00020\u00042\b\b\u0002\u0010<\u001a\u00020\u000fJ\u000e\u0010=\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020\u000fJ\u0018\u0010?\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0018\u0010@\u001a\u00020\u00042\u0006\u0010A\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020\u0004H\u0016J\u0006\u0010B\u001a\u00020 J\u0010\u0010C\u001a\u00020 2\u0006\u0010D\u001a\u00020-H\u0004J\u0006\u0010E\u001a\u00020+J\u0010\u0010F\u001a\u0004\u0018\u00010\u000f2\u0006\u0010)\u001a\u00020 J\u0010\u0010G\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0004H&J1\u0010H\u001a\u00020\u001c2\u0006\u0010I\u001a\u00020 2\b\b\u0002\u0010;\u001a\u00020\u00042\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000f0JH\u0080\bø\u0001\u0000¢\u0006\u0002\bKJ\u000e\u0010L\u001a\u00020\u001c2\u0006\u0010M\u001a\u00020 J\b\u0010N\u001a\u00020\u0004H\u0016J\u0018\u0010O\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u0004H\u0016J\b\u0010Q\u001a\u00020\u000fH\u0002J\b\u0010R\u001a\u00020\u000fH\u0016J\b\u0010S\u001a\u00020 H&J\u0006\u0010T\u001a\u00020 J\u0010\u0010U\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-H\u0004J\b\u0010V\u001a\u00020 H\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u0011X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006W"}, d2 = {"Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "", "()V", "currentPosition", "", "escapedString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "getEscapedString", "()Ljava/lang/StringBuilder;", "setEscapedString", "(Ljava/lang/StringBuilder;)V", MBridgeConstans.DYNAMIC_VIEW_WX_PATH, "Lkotlinx/serialization/json/internal/JsonPath;", "peekedString", "", "source", "", "getSource", "()Ljava/lang/CharSequence;", "appendEsc", "startPosition", "appendEscape", "lastPosition", "current", "appendHex", "startPos", "appendRange", "", "fromIndex", "toIndex", "canConsumeValue", "", "consumeBoolean", "start", "consumeBooleanLenient", "consumeBooleanLiteral", "literalSuffix", "consumeKeyString", "consumeLeadingMatchingValue", "keyToMatch", "isLenient", "consumeNextToken", "", "expected", "", "consumeNumericLiteral", "", "consumeString", "consumeStringLenient", "consumeStringLenientNotNull", "decodedString", "ensureHaveChars", "expectEof", "fail", "", "expectedToken", "fail$kotlinx_serialization_json", PglCryptUtils.KEY_MESSAGE, "position", "hint", "failOnUnknownKey", "key", "fromHexChar", "indexOf", "char", "isNotEof", "isValidValueStart", a.a, "peekNextToken", "peekString", "prefetchOrEof", "require", "condition", "Lkotlin/Function0;", "require$kotlinx_serialization_json", "skipElement", "allowLenientStrings", "skipWhitespaces", "substring", "endPos", "takePeeked", "toString", "tryConsumeComma", "tryConsumeNotNull", "unexpectedToken", "wasUnquotedString", "kotlinx-serialization-json"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AbstractJsonLexer {

    @JvmField
    protected int currentPosition;
    private String peekedString;

    @JvmField
    public final JsonPath path = new JsonPath();
    private StringBuilder escapedString = new StringBuilder();

    private final int appendEsc(int startPosition) {
        int prefetchOrEof = prefetchOrEof(startPosition);
        if (prefetchOrEof != -1) {
            int i10 = prefetchOrEof + 1;
            char charAt = getSource().charAt(prefetchOrEof);
            if (charAt == 'u') {
                return appendHex(getSource(), i10);
            }
            char escapeToChar = AbstractJsonLexerKt.escapeToChar(charAt);
            if (escapeToChar != 0) {
                this.escapedString.append(escapeToChar);
                return i10;
            }
            fail$default(this, "Invalid escaped char '" + charAt + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        fail$default(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final int appendEscape(int lastPosition, int current) {
        appendRange(lastPosition, current);
        return appendEsc(current + 1);
    }

    private final int appendHex(CharSequence source, int startPos) {
        int i10 = startPos + 4;
        if (i10 >= source.length()) {
            this.currentPosition = startPos;
            ensureHaveChars();
            if (this.currentPosition + 4 < source.length()) {
                return appendHex(source, this.currentPosition);
            }
            fail$default(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        this.escapedString.append((char) ((fromHexChar(source, startPos) << 12) + (fromHexChar(source, startPos + 1) << 8) + (fromHexChar(source, startPos + 2) << 4) + fromHexChar(source, startPos + 3)));
        return i10;
    }

    private final void consumeBooleanLiteral(String literalSuffix, int current) {
        if (getSource().length() - current >= literalSuffix.length()) {
            int length = literalSuffix.length();
            for (int i10 = 0; i10 < length; i10++) {
                if (literalSuffix.charAt(i10) != (getSource().charAt(current + i10) | ' ')) {
                    fail$default(this, "Expected valid boolean literal prefix, but had '" + consumeStringLenient() + '\'', 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
            this.currentPosition = literalSuffix.length() + current;
            return;
        }
        fail$default(this, "Unexpected end of boolean literal", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final String decodedString(int lastPosition, int currentPosition) {
        appendRange(lastPosition, currentPosition);
        String sb2 = this.escapedString.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "escapedString.toString()");
        this.escapedString.setLength(0);
        return sb2;
    }

    public static /* synthetic */ Void fail$default(AbstractJsonLexer abstractJsonLexer, String str, int i10, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i11 & 2) != 0) {
            i10 = abstractJsonLexer.currentPosition;
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        return abstractJsonLexer.fail(str, i10, str2);
    }

    private final int fromHexChar(CharSequence source, int currentPosition) {
        boolean z10;
        boolean z11;
        char charAt = source.charAt(currentPosition);
        boolean z12 = true;
        if ('0' <= charAt && charAt < ':') {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return charAt - '0';
        }
        char c10 = 'a';
        if ('a' <= charAt && charAt < 'g') {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            c10 = 'A';
            if ('A' > charAt || charAt >= 'G') {
                z12 = false;
            }
            if (!z12) {
                fail$default(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        return (charAt - c10) + 10;
    }

    public static /* synthetic */ void require$kotlinx_serialization_json$default(AbstractJsonLexer abstractJsonLexer, boolean z10, int i10, Function0 message, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                i10 = abstractJsonLexer.currentPosition;
            }
            int i12 = i10;
            Intrinsics.checkNotNullParameter(message, "message");
            if (z10) {
                return;
            }
            fail$default(abstractJsonLexer, (String) message.invoke(), i12, null, 4, null);
            throw new KotlinNothingValueException();
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: require");
    }

    private final String takePeeked() {
        String str = this.peekedString;
        Intrinsics.checkNotNull(str);
        this.peekedString = null;
        return str;
    }

    private final boolean wasUnquotedString() {
        return getSource().charAt(this.currentPosition - 1) != '\"';
    }

    public void appendRange(int fromIndex, int toIndex) {
        this.escapedString.append(getSource(), fromIndex, toIndex);
    }

    public abstract boolean canConsumeValue();

    public final boolean consumeBoolean() {
        return consumeBoolean(skipWhitespaces());
    }

    public final boolean consumeBooleanLenient() {
        boolean z10;
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces != getSource().length()) {
            if (getSource().charAt(skipWhitespaces) == '\"') {
                skipWhitespaces++;
                z10 = true;
            } else {
                z10 = false;
            }
            boolean consumeBoolean = consumeBoolean(skipWhitespaces);
            if (z10) {
                if (this.currentPosition != getSource().length()) {
                    if (getSource().charAt(this.currentPosition) == '\"') {
                        this.currentPosition++;
                    } else {
                        fail$default(this, "Expected closing quotation mark", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    fail$default(this, "EOF", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
            return consumeBoolean;
        }
        fail$default(this, "EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public abstract String consumeKeyString();

    public abstract String consumeLeadingMatchingValue(String keyToMatch, boolean isLenient);

    public abstract byte consumeNextToken();

    public final byte consumeNextToken(byte expected) {
        byte consumeNextToken = consumeNextToken();
        if (consumeNextToken == expected) {
            return consumeNextToken;
        }
        fail$kotlinx_serialization_json(expected);
        throw new KotlinNothingValueException();
    }

    public final long consumeNumericLiteral() {
        boolean z10;
        boolean z11;
        int prefetchOrEof = prefetchOrEof(skipWhitespaces());
        if (prefetchOrEof < getSource().length() && prefetchOrEof != -1) {
            if (getSource().charAt(prefetchOrEof) == '\"') {
                prefetchOrEof++;
                if (prefetchOrEof != getSource().length()) {
                    z10 = true;
                } else {
                    fail$default(this, "EOF", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                z10 = false;
            }
            int i10 = prefetchOrEof;
            long j3 = 0;
            boolean z12 = true;
            boolean z13 = false;
            while (z12) {
                char charAt = getSource().charAt(i10);
                if (charAt == '-') {
                    if (i10 == prefetchOrEof) {
                        i10++;
                        z13 = true;
                    } else {
                        fail$default(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    if (AbstractJsonLexerKt.charToTokenClass(charAt) != 0) {
                        break;
                    }
                    i10++;
                    if (i10 != getSource().length()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    int i11 = charAt - '0';
                    if (i11 >= 0 && i11 < 10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        j3 = (j3 * 10) - i11;
                        if (j3 > 0) {
                            fail$default(this, "Numeric value overflow", 0, null, 6, null);
                            throw new KotlinNothingValueException();
                        }
                    } else {
                        fail$default(this, "Unexpected symbol '" + charAt + "' in numeric literal", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                }
            }
            if (prefetchOrEof != i10 && (!z13 || prefetchOrEof != i10 - 1)) {
                if (z10) {
                    if (z12) {
                        if (getSource().charAt(i10) == '\"') {
                            i10++;
                        } else {
                            fail$default(this, "Expected closing quotation mark", 0, null, 6, null);
                            throw new KotlinNothingValueException();
                        }
                    } else {
                        fail$default(this, "EOF", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                }
                this.currentPosition = i10;
                if (!z13) {
                    if (j3 != Long.MIN_VALUE) {
                        return -j3;
                    }
                    fail$default(this, "Numeric value overflow", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                return j3;
            }
            fail$default(this, "Expected numeric literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        fail$default(this, "EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final String consumeString() {
        if (this.peekedString != null) {
            return takePeeked();
        }
        return consumeKeyString();
    }

    public final String consumeStringLenient() {
        String decodedString;
        if (this.peekedString != null) {
            return takePeeked();
        }
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces < getSource().length() && skipWhitespaces != -1) {
            byte charToTokenClass = AbstractJsonLexerKt.charToTokenClass(getSource().charAt(skipWhitespaces));
            if (charToTokenClass == 1) {
                return consumeString();
            }
            if (charToTokenClass == 0) {
                boolean z10 = false;
                while (AbstractJsonLexerKt.charToTokenClass(getSource().charAt(skipWhitespaces)) == 0) {
                    skipWhitespaces++;
                    if (skipWhitespaces >= getSource().length()) {
                        appendRange(this.currentPosition, skipWhitespaces);
                        int prefetchOrEof = prefetchOrEof(skipWhitespaces);
                        if (prefetchOrEof == -1) {
                            this.currentPosition = skipWhitespaces;
                            return decodedString(0, 0);
                        }
                        skipWhitespaces = prefetchOrEof;
                        z10 = true;
                    }
                }
                if (!z10) {
                    decodedString = substring(this.currentPosition, skipWhitespaces);
                } else {
                    decodedString = decodedString(this.currentPosition, skipWhitespaces);
                }
                this.currentPosition = skipWhitespaces;
                return decodedString;
            }
            fail$default(this, "Expected beginning of the string, but got " + getSource().charAt(skipWhitespaces), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        fail$default(this, "EOF", skipWhitespaces, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final String consumeStringLenientNotNull() {
        String consumeStringLenient = consumeStringLenient();
        if (Intrinsics.areEqual(consumeStringLenient, AbstractJsonLexerKt.NULL) && wasUnquotedString()) {
            fail$default(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        return consumeStringLenient;
    }

    public void ensureHaveChars() {
    }

    public final void expectEof() {
        if (consumeNextToken() == 10) {
            return;
        }
        fail$default(this, "Expected EOF after parsing, but had " + getSource().charAt(this.currentPosition - 1) + " instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final Void fail(String message, int position, String hint) {
        boolean z10;
        String e2;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(hint, "hint");
        if (hint.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            e2 = "";
        } else {
            e2 = e.e("\n", hint);
        }
        StringBuilder n10 = j.n(message, " at path: ");
        n10.append(this.path.getPath());
        n10.append(e2);
        throw JsonExceptionsKt.JsonDecodingException(position, n10.toString(), getSource());
    }

    public final Void fail$kotlinx_serialization_json(byte expectedToken) {
        String str;
        String str2;
        if (expectedToken == 1) {
            str = "quotation mark '\"'";
        } else if (expectedToken == 4) {
            str = "comma ','";
        } else if (expectedToken == 5) {
            str = "colon ':'";
        } else if (expectedToken == 6) {
            str = "start of the object '{'";
        } else if (expectedToken == 7) {
            str = "end of the object '}'";
        } else if (expectedToken == 8) {
            str = "start of the array '['";
        } else if (expectedToken == 9) {
            str = "end of the array ']'";
        } else {
            str = "valid token";
        }
        if (this.currentPosition != getSource().length() && this.currentPosition > 0) {
            str2 = String.valueOf(getSource().charAt(this.currentPosition - 1));
        } else {
            str2 = "EOF";
        }
        fail$default(this, a4.j.h("Expected ", str, ", but had '", str2, "' instead"), this.currentPosition - 1, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final void failOnUnknownKey(String key) {
        int lastIndexOf$default;
        Intrinsics.checkNotNullParameter(key, "key");
        lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) substring(0, this.currentPosition), key, 0, false, 6, (Object) null);
        fail(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.l("Encountered an unknown key '", key, '\''), lastIndexOf$default, AbstractJsonLexerKt.ignoreUnknownKeysHint);
        throw new KotlinNothingValueException();
    }

    public final StringBuilder getEscapedString() {
        return this.escapedString;
    }

    public abstract CharSequence getSource();

    public int indexOf(char r32, int startPos) {
        int indexOf$default;
        indexOf$default = StringsKt__StringsKt.indexOf$default(getSource(), r32, startPos, false, 4, (Object) null);
        return indexOf$default;
    }

    public final boolean isNotEof() {
        return peekNextToken() != 10;
    }

    public final boolean isValidValueStart(char c10) {
        return !(((c10 == '}' || c10 == ']') || c10 == ':') || c10 == ',');
    }

    public final byte peekNextToken() {
        CharSequence source = getSource();
        int i10 = this.currentPosition;
        while (true) {
            int prefetchOrEof = prefetchOrEof(i10);
            if (prefetchOrEof != -1) {
                char charAt = source.charAt(prefetchOrEof);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.currentPosition = prefetchOrEof;
                    return AbstractJsonLexerKt.charToTokenClass(charAt);
                }
                i10 = prefetchOrEof + 1;
            } else {
                this.currentPosition = prefetchOrEof;
                return (byte) 10;
            }
        }
    }

    public final String peekString(boolean isLenient) {
        String consumeString;
        byte peekNextToken = peekNextToken();
        if (isLenient) {
            if (peekNextToken != 1 && peekNextToken != 0) {
                return null;
            }
            consumeString = consumeStringLenient();
        } else {
            if (peekNextToken != 1) {
                return null;
            }
            consumeString = consumeString();
        }
        this.peekedString = consumeString;
        return consumeString;
    }

    public abstract int prefetchOrEof(int position);

    public final void require$kotlinx_serialization_json(boolean condition, int position, Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (condition) {
            return;
        }
        fail$default(this, message.invoke(), position, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final void setEscapedString(StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(sb2, "<set-?>");
        this.escapedString = sb2;
    }

    public final void skipElement(boolean allowLenientStrings) {
        ArrayList arrayList = new ArrayList();
        byte peekNextToken = peekNextToken();
        if (peekNextToken != 8 && peekNextToken != 6) {
            consumeStringLenient();
            return;
        }
        while (true) {
            byte peekNextToken2 = peekNextToken();
            boolean z10 = true;
            if (peekNextToken2 == 1) {
                if (allowLenientStrings) {
                    consumeStringLenient();
                } else {
                    consumeKeyString();
                }
            } else {
                if (peekNextToken2 != 8 && peekNextToken2 != 6) {
                    z10 = false;
                }
                if (z10) {
                    arrayList.add(Byte.valueOf(peekNextToken2));
                } else if (peekNextToken2 == 9) {
                    if (((Number) CollectionsKt.last((List) arrayList)).byteValue() == 8) {
                        CollectionsKt.removeLast(arrayList);
                    } else {
                        throw JsonExceptionsKt.JsonDecodingException(this.currentPosition, "found ] instead of } at path: " + this.path, getSource());
                    }
                } else if (peekNextToken2 == 7) {
                    if (((Number) CollectionsKt.last((List) arrayList)).byteValue() == 6) {
                        CollectionsKt.removeLast(arrayList);
                    } else {
                        throw JsonExceptionsKt.JsonDecodingException(this.currentPosition, "found } instead of ] at path: " + this.path, getSource());
                    }
                } else if (peekNextToken2 == 10) {
                    fail$default(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                consumeNextToken();
                if (arrayList.size() == 0) {
                    return;
                }
            }
        }
    }

    public int skipWhitespaces() {
        int prefetchOrEof;
        char charAt;
        int i10 = this.currentPosition;
        while (true) {
            prefetchOrEof = prefetchOrEof(i10);
            if (prefetchOrEof == -1 || !((charAt = getSource().charAt(prefetchOrEof)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i10 = prefetchOrEof + 1;
        }
        this.currentPosition = prefetchOrEof;
        return prefetchOrEof;
    }

    public String substring(int startPos, int endPos) {
        return getSource().subSequence(startPos, endPos).toString();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("JsonReader(source='");
        sb2.append((Object) getSource());
        sb2.append("', currentPosition=");
        return a4.j.i(sb2, this.currentPosition, ')');
    }

    public abstract boolean tryConsumeComma();

    public final boolean tryConsumeNotNull() {
        int prefetchOrEof = prefetchOrEof(skipWhitespaces());
        int length = getSource().length() - prefetchOrEof;
        if (length < 4 || prefetchOrEof == -1) {
            return true;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if (AbstractJsonLexerKt.NULL.charAt(i10) != getSource().charAt(prefetchOrEof + i10)) {
                return true;
            }
        }
        if (length > 4 && AbstractJsonLexerKt.charToTokenClass(getSource().charAt(prefetchOrEof + 4)) == 0) {
            return true;
        }
        this.currentPosition = prefetchOrEof + 4;
        return false;
    }

    public final void unexpectedToken(char expected) {
        int i10 = this.currentPosition - 1;
        this.currentPosition = i10;
        if (i10 >= 0 && expected == '\"' && Intrinsics.areEqual(consumeStringLenient(), AbstractJsonLexerKt.NULL)) {
            fail("Expected string literal but 'null' literal was found", this.currentPosition - 4, AbstractJsonLexerKt.coerceInputValuesHint);
            throw new KotlinNothingValueException();
        }
        fail$kotlinx_serialization_json(AbstractJsonLexerKt.charToTokenClass(expected));
        throw new KotlinNothingValueException();
    }

    private final boolean consumeBoolean(int start) {
        int prefetchOrEof = prefetchOrEof(start);
        if (prefetchOrEof < getSource().length() && prefetchOrEof != -1) {
            int i10 = prefetchOrEof + 1;
            int charAt = getSource().charAt(prefetchOrEof) | ' ';
            if (charAt == 102) {
                consumeBooleanLiteral("alse", i10);
                return false;
            }
            if (charAt == 116) {
                consumeBooleanLiteral("rue", i10);
                return true;
            }
            fail$default(this, "Expected valid boolean literal prefix, but had '" + consumeStringLenient() + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        fail$default(this, "EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public void consumeNextToken(char expected) {
        ensureHaveChars();
        CharSequence source = getSource();
        int i10 = this.currentPosition;
        while (true) {
            int prefetchOrEof = prefetchOrEof(i10);
            if (prefetchOrEof != -1) {
                int i11 = prefetchOrEof + 1;
                char charAt = source.charAt(prefetchOrEof);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.currentPosition = i11;
                    if (charAt == expected) {
                        return;
                    } else {
                        unexpectedToken(expected);
                    }
                }
                i10 = i11;
            } else {
                this.currentPosition = prefetchOrEof;
                unexpectedToken(expected);
                return;
            }
        }
    }

    public final String consumeString(CharSequence source, int startPosition, int current) {
        String decodedString;
        int prefetchOrEof;
        Intrinsics.checkNotNullParameter(source, "source");
        char charAt = source.charAt(current);
        boolean z10 = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                prefetchOrEof = prefetchOrEof(appendEscape(startPosition, current));
                if (prefetchOrEof == -1) {
                    fail$default(this, "EOF", prefetchOrEof, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                current++;
                if (current >= source.length()) {
                    appendRange(startPosition, current);
                    prefetchOrEof = prefetchOrEof(current);
                    if (prefetchOrEof == -1) {
                        fail$default(this, "EOF", prefetchOrEof, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    continue;
                    charAt = source.charAt(current);
                }
            }
            z10 = true;
            startPosition = prefetchOrEof;
            current = startPosition;
            charAt = source.charAt(current);
        }
        if (!z10) {
            decodedString = substring(startPosition, current);
        } else {
            decodedString = decodedString(startPosition, current);
        }
        this.currentPosition = current + 1;
        return decodedString;
    }
}
