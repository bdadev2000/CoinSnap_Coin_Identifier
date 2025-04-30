package com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv;

import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import java.io.IOException;

/* loaded from: classes3.dex */
interface EbmlReaderOutput {
    public static final int TYPE_BINARY = 4;
    public static final int TYPE_FLOAT = 5;
    public static final int TYPE_MASTER = 1;
    public static final int TYPE_STRING = 3;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_UNSIGNED_INT = 2;

    /* loaded from: classes3.dex */
    public @interface ElementType {
    }

    void binaryElement(int i9, int i10, ExtractorInput extractorInput) throws IOException, InterruptedException;

    void endMasterElement(int i9) throws ParserException;

    void floatElement(int i9, double d2) throws ParserException;

    int getElementType(int i9);

    void integerElement(int i9, long j7) throws ParserException;

    boolean isLevel1Element(int i9);

    void startMasterElement(int i9, long j7, long j9) throws ParserException;

    void stringElement(int i9, String str) throws ParserException;
}
