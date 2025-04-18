package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lkotlinx/serialization/json/internal/StringJsonLexer;", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "source", "", "(Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "canConsumeValue", "", "consumeKeyString", "consumeLeadingMatchingValue", "keyToMatch", "isLenient", "consumeNextToken", "", "", "expected", "", "prefetchOrEof", "", "position", "skipWhitespaces", "tryConsumeComma", "kotlinx-serialization-json"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class StringJsonLexer extends AbstractJsonLexer {
    private final String source;

    public StringJsonLexer(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean canConsumeValue() {
        int i10 = this.currentPosition;
        if (i10 == -1) {
            return false;
        }
        while (i10 < getSource().length()) {
            char charAt = getSource().charAt(i10);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.currentPosition = i10;
                return isValidValueStart(charAt);
            }
            i10++;
        }
        this.currentPosition = i10;
        return false;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public String consumeKeyString() {
        int indexOf$default;
        consumeNextToken('\"');
        int i10 = this.currentPosition;
        indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) getSource(), '\"', i10, false, 4, (Object) null);
        if (indexOf$default != -1) {
            for (int i11 = i10; i11 < indexOf$default; i11++) {
                if (getSource().charAt(i11) == '\\') {
                    return consumeString(getSource(), this.currentPosition, i11);
                }
            }
            this.currentPosition = indexOf$default + 1;
            String substring = getSource().substring(i10, indexOf$default);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        fail$kotlinx_serialization_json((byte) 1);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public String consumeLeadingMatchingValue(String keyToMatch, boolean isLenient) {
        String consumeStringLenientNotNull;
        String consumeStringLenientNotNull2;
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        int i10 = this.currentPosition;
        try {
            if (consumeNextToken() != 6) {
                return null;
            }
            if (isLenient) {
                consumeStringLenientNotNull = consumeKeyString();
            } else {
                consumeStringLenientNotNull = consumeStringLenientNotNull();
            }
            if (!Intrinsics.areEqual(consumeStringLenientNotNull, keyToMatch)) {
                return null;
            }
            if (consumeNextToken() != 5) {
                return null;
            }
            if (isLenient) {
                consumeStringLenientNotNull2 = consumeString();
            } else {
                consumeStringLenientNotNull2 = consumeStringLenientNotNull();
            }
            return consumeStringLenientNotNull2;
        } finally {
            this.currentPosition = i10;
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte consumeNextToken() {
        byte charToTokenClass;
        String source = getSource();
        do {
            int i10 = this.currentPosition;
            if (i10 == -1 || i10 >= source.length()) {
                return (byte) 10;
            }
            int i11 = this.currentPosition;
            this.currentPosition = i11 + 1;
            charToTokenClass = AbstractJsonLexerKt.charToTokenClass(source.charAt(i11));
        } while (charToTokenClass == 3);
        return charToTokenClass;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int prefetchOrEof(int position) {
        if (position < getSource().length()) {
            return position;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int skipWhitespaces() {
        char charAt;
        int i10 = this.currentPosition;
        if (i10 == -1) {
            return i10;
        }
        while (i10 < getSource().length() && ((charAt = getSource().charAt(i10)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i10++;
        }
        this.currentPosition = i10;
        return i10;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean tryConsumeComma() {
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces == getSource().length() || skipWhitespaces == -1 || getSource().charAt(skipWhitespaces) != ',') {
            return false;
        }
        this.currentPosition++;
        return true;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public String getSource() {
        return this.source;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void consumeNextToken(char expected) {
        if (this.currentPosition == -1) {
            unexpectedToken(expected);
        }
        String source = getSource();
        while (this.currentPosition < source.length()) {
            int i10 = this.currentPosition;
            this.currentPosition = i10 + 1;
            char charAt = source.charAt(i10);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt == expected) {
                    return;
                } else {
                    unexpectedToken(expected);
                }
            }
        }
        unexpectedToken(expected);
    }
}
