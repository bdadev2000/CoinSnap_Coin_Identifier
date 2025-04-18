package com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv;

import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import eb.j;
import java.io.IOException;
import java.util.ArrayDeque;
import kotlin.UByte;

/* loaded from: classes4.dex */
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

    /* loaded from: classes4.dex */
    public @interface ElementState {
    }

    /* loaded from: classes4.dex */
    public static final class MasterElement {
        private final long elementEndPosition;
        private final int elementId;

        private MasterElement(int i10, long j3) {
            this.elementId = i10;
            this.elementEndPosition = j3;
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

    private double readFloat(ExtractorInput extractorInput, int i10) throws IOException, InterruptedException {
        long readInteger = readInteger(extractorInput, i10);
        if (i10 == 4) {
            return Float.intBitsToFloat((int) readInteger);
        }
        return Double.longBitsToDouble(readInteger);
    }

    private long readInteger(ExtractorInput extractorInput, int i10) throws IOException, InterruptedException {
        extractorInput.readFully(this.scratch, 0, i10);
        long j3 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j3 = (j3 << 8) | (this.scratch[i11] & UByte.MAX_VALUE);
        }
        return j3;
    }

    private String readString(ExtractorInput extractorInput, int i10) throws IOException, InterruptedException {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        extractorInput.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.EbmlReader
    public final void init(EbmlReaderOutput ebmlReaderOutput) {
        this.output = ebmlReaderOutput;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.EbmlReader
    public final boolean read(ExtractorInput extractorInput) throws IOException, InterruptedException {
        boolean z10;
        if (this.output != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkState(z10);
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
                                    long j3 = this.elementContentSize;
                                    if (j3 != 4 && j3 != 8) {
                                        throw new ParserException("Invalid float size: " + this.elementContentSize);
                                    }
                                    this.output.floatElement(this.elementId, readFloat(extractorInput, (int) j3));
                                    this.elementState = 0;
                                    return true;
                                }
                                throw new ParserException(j.i("Invalid element type ", elementType));
                            }
                            this.output.binaryElement(this.elementId, (int) this.elementContentSize, extractorInput);
                            this.elementState = 0;
                            return true;
                        }
                        long j10 = this.elementContentSize;
                        if (j10 <= 2147483647L) {
                            this.output.stringElement(this.elementId, readString(extractorInput, (int) j10));
                            this.elementState = 0;
                            return true;
                        }
                        throw new ParserException("String element size: " + this.elementContentSize);
                    }
                    long j11 = this.elementContentSize;
                    if (j11 <= 8) {
                        this.output.integerElement(this.elementId, readInteger(extractorInput, (int) j11));
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
