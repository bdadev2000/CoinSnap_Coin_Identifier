package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0012H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u000eH\u0016J\u0018\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\fH\u0016J\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\fH\u0016J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\fH\u0002J\u0018\u0010#\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010$\u001a\u00020\fH\u0016J\b\u0010%\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "reader", "Lkotlinx/serialization/json/internal/SerialReader;", "charsBuffer", "", "(Lkotlinx/serialization/json/internal/SerialReader;[C)V", "source", "Lkotlinx/serialization/json/internal/ArrayAsSequence;", "getSource", "()Lkotlinx/serialization/json/internal/ArrayAsSequence;", "threshold", "", "appendRange", "", "fromIndex", "toIndex", "canConsumeValue", "", "consumeKeyString", "", "consumeLeadingMatchingValue", "keyToMatch", "isLenient", "consumeNextToken", "", "ensureHaveChars", "indexOf", "char", "", "startPos", "prefetchOrEof", "position", "preload", "unprocessedCount", "substring", "endPos", "tryConsumeComma", "kotlinx-serialization-json"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class ReaderJsonLexer extends AbstractJsonLexer {
    private final SerialReader reader;
    private final ArrayAsSequence source;
    private int threshold;

    public /* synthetic */ ReaderJsonLexer(SerialReader serialReader, char[] cArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(serialReader, (i10 & 2) != 0 ? new char[JsonLexerKt.BATCH_SIZE] : cArr);
    }

    private final void preload(int unprocessedCount) {
        char[] buffer = getSource().getBuffer();
        if (unprocessedCount != 0) {
            int i10 = this.currentPosition;
            ArraysKt___ArraysJvmKt.copyInto(buffer, buffer, 0, i10, i10 + unprocessedCount);
        }
        int length = getSource().length();
        while (true) {
            if (unprocessedCount == length) {
                break;
            }
            int read = this.reader.read(buffer, unprocessedCount, length - unprocessedCount);
            if (read == -1) {
                getSource().trim(unprocessedCount);
                this.threshold = -1;
                break;
            }
            unprocessedCount += read;
        }
        this.currentPosition = 0;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void appendRange(int fromIndex, int toIndex) {
        StringBuilder escapedString = getEscapedString();
        escapedString.append(getSource().getBuffer(), fromIndex, toIndex - fromIndex);
        Intrinsics.checkNotNullExpressionValue(escapedString, "this.append(value, start…x, endIndex - startIndex)");
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean canConsumeValue() {
        ensureHaveChars();
        int i10 = this.currentPosition;
        while (true) {
            int prefetchOrEof = prefetchOrEof(i10);
            if (prefetchOrEof != -1) {
                char charAt = getSource().charAt(prefetchOrEof);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.currentPosition = prefetchOrEof;
                    return isValidValueStart(charAt);
                }
                i10 = prefetchOrEof + 1;
            } else {
                this.currentPosition = prefetchOrEof;
                return false;
            }
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public String consumeKeyString() {
        consumeNextToken('\"');
        int i10 = this.currentPosition;
        int indexOf = indexOf('\"', i10);
        if (indexOf == -1) {
            int prefetchOrEof = prefetchOrEof(i10);
            if (prefetchOrEof != -1) {
                return consumeString(getSource(), this.currentPosition, prefetchOrEof);
            }
            fail$kotlinx_serialization_json((byte) 1);
            throw new KotlinNothingValueException();
        }
        for (int i11 = i10; i11 < indexOf; i11++) {
            if (getSource().charAt(i11) == '\\') {
                return consumeString(getSource(), this.currentPosition, i11);
            }
        }
        this.currentPosition = indexOf + 1;
        return substring(i10, indexOf);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public String consumeLeadingMatchingValue(String keyToMatch, boolean isLenient) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        return null;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte consumeNextToken() {
        ensureHaveChars();
        ArrayAsSequence source = getSource();
        int i10 = this.currentPosition;
        while (true) {
            int prefetchOrEof = prefetchOrEof(i10);
            if (prefetchOrEof != -1) {
                int i11 = prefetchOrEof + 1;
                byte charToTokenClass = AbstractJsonLexerKt.charToTokenClass(source.charAt(prefetchOrEof));
                if (charToTokenClass != 3) {
                    this.currentPosition = i11;
                    return charToTokenClass;
                }
                i10 = i11;
            } else {
                this.currentPosition = prefetchOrEof;
                return (byte) 10;
            }
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void ensureHaveChars() {
        int length = getSource().length() - this.currentPosition;
        if (length > this.threshold) {
            return;
        }
        preload(length);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int indexOf(char r42, int startPos) {
        ArrayAsSequence source = getSource();
        int length = source.length();
        while (startPos < length) {
            if (source.charAt(startPos) == r42) {
                return startPos;
            }
            startPos++;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int prefetchOrEof(int position) {
        boolean z10;
        if (position < getSource().length()) {
            return position;
        }
        this.currentPosition = position;
        ensureHaveChars();
        if (this.currentPosition == 0) {
            if (getSource().length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return 0;
            }
            return -1;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public String substring(int startPos, int endPos) {
        return getSource().substring(startPos, endPos);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean tryConsumeComma() {
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces >= getSource().length() || skipWhitespaces == -1 || getSource().charAt(skipWhitespaces) != ',') {
            return false;
        }
        this.currentPosition++;
        return true;
    }

    public ReaderJsonLexer(SerialReader reader, char[] charsBuffer) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(charsBuffer, "charsBuffer");
        this.reader = reader;
        this.threshold = 128;
        this.source = new ArrayAsSequence(charsBuffer);
        preload(0);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public ArrayAsSequence getSource() {
        return this.source;
    }
}
