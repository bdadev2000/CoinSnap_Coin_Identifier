package com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv;

import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import java.io.IOException;

/* loaded from: classes4.dex */
interface EbmlReaderOutput {
    public static final int TYPE_BINARY = 4;
    public static final int TYPE_FLOAT = 5;
    public static final int TYPE_MASTER = 1;
    public static final int TYPE_STRING = 3;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_UNSIGNED_INT = 2;

    /* loaded from: classes4.dex */
    public @interface ElementType {
    }

    void binaryElement(int i10, int i11, ExtractorInput extractorInput) throws IOException, InterruptedException;

    void endMasterElement(int i10) throws ParserException;

    void floatElement(int i10, double d10) throws ParserException;

    int getElementType(int i10);

    void integerElement(int i10, long j3) throws ParserException;

    boolean isLevel1Element(int i10);

    void startMasterElement(int i10, long j3, long j10) throws ParserException;

    void stringElement(int i10, String str) throws ParserException;
}
