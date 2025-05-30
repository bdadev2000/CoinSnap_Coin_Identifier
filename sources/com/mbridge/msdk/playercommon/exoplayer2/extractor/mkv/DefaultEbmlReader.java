package com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv;

import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
final class DefaultEbmlReader implements EbmlReader {
    private static final int ELEMENT_STATE_READ_CONTENT = 2;
    private static final int ELEMENT_STATE_READ_CONTENT_SIZE = 1;
    private static final int ELEMENT_STATE_READ_ID = 0;
    private static final int MAX_ID_BYTES = 4;
    private static final int MAX_INTEGER_ELEMENT_SIZE_BYTES = 8;
    private static final int MAX_LENGTH_BYTES = 8;
    private static final int VALID_FLOAT32_ELEMENT_SIZE_BYTES = 4;
    private static final int VALID_FLOAT64_ELEMENT_SIZE_BYTES = 8;
    private long elementContentSize;
    private int elementId;
    private int elementState;
    private EbmlReaderOutput output;
    private final byte[] scratch = new byte[8];
    private final ArrayDeque<MasterElement> masterElementsStack = new ArrayDeque<>();
    private final VarintReader varintReader = new VarintReader();

    /* loaded from: classes3.dex */
    public @interface ElementState {
    }

    /* loaded from: classes3.dex */
    public static final class MasterElement {
        private final long elementEndPosition;
        private final int elementId;

        private MasterElement(int i9, long j7) {
            this.elementId = i9;
            this.elementEndPosition = j7;
        }
    }

    private long maybeResyncToNextLevel1Element(ExtractorInput extractorInput) throws IOException, InterruptedException {
        extractorInput.resetPeekPosition();
        while (true) {
            extractorInput.peekFully(this.scratch, 0, 4);
            int parseUnsignedVarintLength = VarintReader.parseUnsignedVarintLength(this.scratch[0]);
            if (parseUnsignedVarintLength != -1 && parseUnsignedVarintLength <= 4) {
                int assembleVarint = (int) VarintReader.assembleVarint(this.scratch, parseUnsignedVarintLength, false);
                if (this.output.isLevel1Element(assembleVarint)) {
                    extractorInput.skipFully(parseUnsignedVarintLength);
                    return assembleVarint;
                }
            }
            extractorInput.skipFully(1);
        }
    }

    private double readFloat(ExtractorInput extractorInput, int i9) throws IOException, InterruptedException {
        long readInteger = readInteger(extractorInput, i9);
        if (i9 == 4) {
            return Float.intBitsToFloat((int) readInteger);
        }
        return Double.longBitsToDouble(readInteger);
    }

    private long readInteger(ExtractorInput extractorInput, int i9) throws IOException, InterruptedException {
        extractorInput.readFully(this.scratch, 0, i9);
        long j7 = 0;
        for (int i10 = 0; i10 < i9; i10++) {
            j7 = (j7 << 8) | (this.scratch[i10] & 255);
        }
        return j7;
    }

    private String readString(ExtractorInput extractorInput, int i9) throws IOException, InterruptedException {
        if (i9 == 0) {
            return "";
        }
        byte[] bArr = new byte[i9];
        extractorInput.readFully(bArr, 0, i9);
        while (i9 > 0 && bArr[i9 - 1] == 0) {
            i9--;
        }
        return new String(bArr, 0, i9);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.EbmlReader
    public final void init(EbmlReaderOutput ebmlReaderOutput) {
        this.output = ebmlReaderOutput;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.EbmlReader
    public final boolean read(ExtractorInput extractorInput) throws IOException, InterruptedException {
        boolean z8;
        if (this.output != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkState(z8);
        while (true) {
            if (!this.masterElementsStack.isEmpty() && extractorInput.getPosition() >= this.masterElementsStack.peek().elementEndPosition) {
                this.output.endMasterElement(this.masterElementsStack.pop().elementId);
                return true;
            }
            if (this.elementState == 0) {
                long readUnsignedVarint = this.varintReader.readUnsignedVarint(extractorInput, true, false, 4);
                if (readUnsignedVarint == -2) {
                    readUnsignedVarint = maybeResyncToNextLevel1Element(extractorInput);
                }
                if (readUnsignedVarint == -1) {
                    return false;
                }
                this.elementId = (int) readUnsignedVarint;
                this.elementState = 1;
            }
            if (this.elementState == 1) {
                this.elementContentSize = this.varintReader.readUnsignedVarint(extractorInput, false, true, 8);
                this.elementState = 2;
            }
            int elementType = this.output.getElementType(this.elementId);
            if (elementType != 0) {
                if (elementType != 1) {
                    if (elementType != 2) {
                        if (elementType != 3) {
                            if (elementType != 4) {
                                if (elementType == 5) {
                                    long j7 = this.elementContentSize;
                                    if (j7 != 4 && j7 != 8) {
                                        throw new ParserException("Invalid float size: " + this.elementContentSize);
                                    }
                                    this.output.floatElement(this.elementId, readFloat(extractorInput, (int) j7));
                                    this.elementState = 0;
                                    return true;
                                }
                                throw new ParserException(o.h(elementType, "Invalid element type "));
                            }
                            this.output.binaryElement(this.elementId, (int) this.elementContentSize, extractorInput);
                            this.elementState = 0;
                            return true;
                        }
                        long j9 = this.elementContentSize;
                        if (j9 <= 2147483647L) {
                            this.output.stringElement(this.elementId, readString(extractorInput, (int) j9));
                            this.elementState = 0;
                            return true;
                        }
                        throw new ParserException("String element size: " + this.elementContentSize);
                    }
                    long j10 = this.elementContentSize;
                    if (j10 <= 8) {
                        this.output.integerElement(this.elementId, readInteger(extractorInput, (int) j10));
                        this.elementState = 0;
                        return true;
                    }
                    throw new ParserException("Invalid integer size: " + this.elementContentSize);
                }
                long position = extractorInput.getPosition();
                this.masterElementsStack.push(new MasterElement(this.elementId, this.elementContentSize + position));
                this.output.startMasterElement(this.elementId, position, this.elementContentSize);
                this.elementState = 0;
                return true;
            }
            extractorInput.skipFully((int) this.elementContentSize);
            this.elementState = 0;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.EbmlReader
    public final void reset() {
        this.elementState = 0;
        this.masterElementsStack.clear();
        this.varintReader.reset();
    }
}
