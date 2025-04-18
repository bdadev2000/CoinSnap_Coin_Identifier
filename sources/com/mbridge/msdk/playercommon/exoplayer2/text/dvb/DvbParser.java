package com.mbridge.msdk.playercommon.exoplayer2.text.dvb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Region;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.text.Cue;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableBitArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
final class DvbParser {
    private static final int DATA_TYPE_24_TABLE_DATA = 32;
    private static final int DATA_TYPE_28_TABLE_DATA = 33;
    private static final int DATA_TYPE_2BP_CODE_STRING = 16;
    private static final int DATA_TYPE_48_TABLE_DATA = 34;
    private static final int DATA_TYPE_4BP_CODE_STRING = 17;
    private static final int DATA_TYPE_8BP_CODE_STRING = 18;
    private static final int DATA_TYPE_END_LINE = 240;
    private static final int OBJECT_CODING_PIXELS = 0;
    private static final int OBJECT_CODING_STRING = 1;
    private static final int PAGE_STATE_NORMAL = 0;
    private static final int REGION_DEPTH_4_BIT = 2;
    private static final int REGION_DEPTH_8_BIT = 3;
    private static final int SEGMENT_TYPE_CLUT_DEFINITION = 18;
    private static final int SEGMENT_TYPE_DISPLAY_DEFINITION = 20;
    private static final int SEGMENT_TYPE_OBJECT_DATA = 19;
    private static final int SEGMENT_TYPE_PAGE_COMPOSITION = 16;
    private static final int SEGMENT_TYPE_REGION_COMPOSITION = 17;
    private static final String TAG = "DvbParser";
    private static final byte[] defaultMap2To4 = {0, 7, 8, Ascii.SI};
    private static final byte[] defaultMap2To8 = {0, 119, -120, -1};
    private static final byte[] defaultMap4To8 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private Bitmap bitmap;
    private final Canvas canvas;
    private final ClutDefinition defaultClutDefinition;
    private final DisplayDefinition defaultDisplayDefinition;
    private final Paint defaultPaint;
    private final Paint fillRegionPaint;
    private final SubtitleService subtitleService;

    /* loaded from: classes4.dex */
    public static final class ClutDefinition {
        public final int[] clutEntries2Bit;
        public final int[] clutEntries4Bit;
        public final int[] clutEntries8Bit;

        /* renamed from: id, reason: collision with root package name */
        public final int f14736id;

        public ClutDefinition(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f14736id = i10;
            this.clutEntries2Bit = iArr;
            this.clutEntries4Bit = iArr2;
            this.clutEntries8Bit = iArr3;
        }
    }

    /* loaded from: classes4.dex */
    public static final class DisplayDefinition {
        public final int height;
        public final int horizontalPositionMaximum;
        public final int horizontalPositionMinimum;
        public final int verticalPositionMaximum;
        public final int verticalPositionMinimum;
        public final int width;

        public DisplayDefinition(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.width = i10;
            this.height = i11;
            this.horizontalPositionMinimum = i12;
            this.horizontalPositionMaximum = i13;
            this.verticalPositionMinimum = i14;
            this.verticalPositionMaximum = i15;
        }
    }

    /* loaded from: classes4.dex */
    public static final class ObjectData {
        public final byte[] bottomFieldData;

        /* renamed from: id, reason: collision with root package name */
        public final int f14737id;
        public final boolean nonModifyingColorFlag;
        public final byte[] topFieldData;

        public ObjectData(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f14737id = i10;
            this.nonModifyingColorFlag = z10;
            this.topFieldData = bArr;
            this.bottomFieldData = bArr2;
        }
    }

    /* loaded from: classes4.dex */
    public static final class PageComposition {
        public final SparseArray<PageRegion> regions;
        public final int state;
        public final int timeOutSecs;
        public final int version;

        public PageComposition(int i10, int i11, int i12, SparseArray<PageRegion> sparseArray) {
            this.timeOutSecs = i10;
            this.version = i11;
            this.state = i12;
            this.regions = sparseArray;
        }
    }

    /* loaded from: classes4.dex */
    public static final class PageRegion {
        public final int horizontalAddress;
        public final int verticalAddress;

        public PageRegion(int i10, int i11) {
            this.horizontalAddress = i10;
            this.verticalAddress = i11;
        }
    }

    /* loaded from: classes4.dex */
    public static final class RegionComposition {
        public final int clutId;
        public final int depth;
        public final boolean fillFlag;
        public final int height;

        /* renamed from: id, reason: collision with root package name */
        public final int f14738id;
        public final int levelOfCompatibility;
        public final int pixelCode2Bit;
        public final int pixelCode4Bit;
        public final int pixelCode8Bit;
        public final SparseArray<RegionObject> regionObjects;
        public final int width;

        public RegionComposition(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray<RegionObject> sparseArray) {
            this.f14738id = i10;
            this.fillFlag = z10;
            this.width = i11;
            this.height = i12;
            this.levelOfCompatibility = i13;
            this.depth = i14;
            this.clutId = i15;
            this.pixelCode8Bit = i16;
            this.pixelCode4Bit = i17;
            this.pixelCode2Bit = i18;
            this.regionObjects = sparseArray;
        }

        public final void mergeFrom(RegionComposition regionComposition) {
            if (regionComposition == null) {
                return;
            }
            SparseArray<RegionObject> sparseArray = regionComposition.regionObjects;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.regionObjects.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10));
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class RegionObject {
        public final int backgroundPixelCode;
        public final int foregroundPixelCode;
        public final int horizontalPosition;
        public final int provider;
        public final int type;
        public final int verticalPosition;

        public RegionObject(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.type = i10;
            this.provider = i11;
            this.horizontalPosition = i12;
            this.verticalPosition = i13;
            this.foregroundPixelCode = i14;
            this.backgroundPixelCode = i15;
        }
    }

    /* loaded from: classes4.dex */
    public static final class SubtitleService {
        public final int ancillaryPageId;
        public DisplayDefinition displayDefinition;
        public PageComposition pageComposition;
        public final int subtitlePageId;
        public final SparseArray<RegionComposition> regions = new SparseArray<>();
        public final SparseArray<ClutDefinition> cluts = new SparseArray<>();
        public final SparseArray<ObjectData> objects = new SparseArray<>();
        public final SparseArray<ClutDefinition> ancillaryCluts = new SparseArray<>();
        public final SparseArray<ObjectData> ancillaryObjects = new SparseArray<>();

        public SubtitleService(int i10, int i11) {
            this.subtitlePageId = i10;
            this.ancillaryPageId = i11;
        }

        public final void reset() {
            this.regions.clear();
            this.cluts.clear();
            this.objects.clear();
            this.ancillaryCluts.clear();
            this.ancillaryObjects.clear();
            this.displayDefinition = null;
            this.pageComposition = null;
        }
    }

    public DvbParser(int i10, int i11) {
        Paint paint = new Paint();
        this.defaultPaint = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.fillRegionPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.canvas = new Canvas();
        this.defaultDisplayDefinition = new DisplayDefinition(719, 575, 0, 719, 0, 575);
        this.defaultClutDefinition = new ClutDefinition(0, generateDefault2BitClutEntries(), generateDefault4BitClutEntries(), generateDefault8BitClutEntries());
        this.subtitleService = new SubtitleService(i10, i11);
    }

    private static byte[] buildClutMapTable(int i10, int i11, ParsableBitArray parsableBitArray) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) parsableBitArray.readBits(i11);
        }
        return bArr;
    }

    private static int[] generateDefault2BitClutEntries() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    private static int[] generateDefault4BitClutEntries() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i15 = 1; i15 < 16; i15++) {
            if (i15 < 8) {
                if ((i15 & 1) != 0) {
                    i12 = 255;
                } else {
                    i12 = 0;
                }
                if ((i15 & 2) != 0) {
                    i13 = 255;
                } else {
                    i13 = 0;
                }
                if ((i15 & 4) != 0) {
                    i14 = 255;
                } else {
                    i14 = 0;
                }
                iArr[i15] = getColor(255, i12, i13, i14);
            } else {
                int i16 = 127;
                if ((i15 & 1) != 0) {
                    i10 = 127;
                } else {
                    i10 = 0;
                }
                if ((i15 & 2) != 0) {
                    i11 = 127;
                } else {
                    i11 = 0;
                }
                if ((i15 & 4) == 0) {
                    i16 = 0;
                }
                iArr[i15] = getColor(255, i10, i11, i16);
            }
        }
        return iArr;
    }

    private static int[] generateDefault8BitClutEntries() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int[] iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        iArr[0] = 0;
        for (int i28 = 0; i28 < 256; i28++) {
            int i29 = 255;
            if (i28 < 8) {
                if ((i28 & 1) != 0) {
                    i26 = 255;
                } else {
                    i26 = 0;
                }
                if ((i28 & 2) != 0) {
                    i27 = 255;
                } else {
                    i27 = 0;
                }
                if ((i28 & 4) == 0) {
                    i29 = 0;
                }
                iArr[i28] = getColor(63, i26, i27, i29);
            } else {
                int i30 = i28 & 136;
                int i31 = 170;
                int i32 = 85;
                if (i30 != 0) {
                    if (i30 != 8) {
                        int i33 = 43;
                        if (i30 != 128) {
                            if (i30 == 136) {
                                if ((i28 & 1) != 0) {
                                    i22 = 43;
                                } else {
                                    i22 = 0;
                                }
                                if ((i28 & 16) != 0) {
                                    i23 = 85;
                                } else {
                                    i23 = 0;
                                }
                                int i34 = i22 + i23;
                                if ((i28 & 2) != 0) {
                                    i24 = 43;
                                } else {
                                    i24 = 0;
                                }
                                if ((i28 & 32) != 0) {
                                    i25 = 85;
                                } else {
                                    i25 = 0;
                                }
                                int i35 = i24 + i25;
                                if ((i28 & 4) == 0) {
                                    i33 = 0;
                                }
                                if ((i28 & 64) == 0) {
                                    i32 = 0;
                                }
                                iArr[i28] = getColor(255, i34, i35, i33 + i32);
                            }
                        } else {
                            if ((i28 & 1) != 0) {
                                i18 = 43;
                            } else {
                                i18 = 0;
                            }
                            int i36 = i18 + 127;
                            if ((i28 & 16) != 0) {
                                i19 = 85;
                            } else {
                                i19 = 0;
                            }
                            int i37 = i36 + i19;
                            if ((i28 & 2) != 0) {
                                i20 = 43;
                            } else {
                                i20 = 0;
                            }
                            int i38 = i20 + 127;
                            if ((i28 & 32) != 0) {
                                i21 = 85;
                            } else {
                                i21 = 0;
                            }
                            int i39 = i38 + i21;
                            if ((i28 & 4) == 0) {
                                i33 = 0;
                            }
                            int i40 = i33 + 127;
                            if ((i28 & 64) == 0) {
                                i32 = 0;
                            }
                            iArr[i28] = getColor(255, i37, i39, i40 + i32);
                        }
                    } else {
                        if ((i28 & 1) != 0) {
                            i14 = 85;
                        } else {
                            i14 = 0;
                        }
                        if ((i28 & 16) != 0) {
                            i15 = 170;
                        } else {
                            i15 = 0;
                        }
                        int i41 = i14 + i15;
                        if ((i28 & 2) != 0) {
                            i16 = 85;
                        } else {
                            i16 = 0;
                        }
                        if ((i28 & 32) != 0) {
                            i17 = 170;
                        } else {
                            i17 = 0;
                        }
                        int i42 = i16 + i17;
                        if ((i28 & 4) == 0) {
                            i32 = 0;
                        }
                        if ((i28 & 64) == 0) {
                            i31 = 0;
                        }
                        iArr[i28] = getColor(127, i41, i42, i32 + i31);
                    }
                } else {
                    if ((i28 & 1) != 0) {
                        i10 = 85;
                    } else {
                        i10 = 0;
                    }
                    if ((i28 & 16) != 0) {
                        i11 = 170;
                    } else {
                        i11 = 0;
                    }
                    int i43 = i10 + i11;
                    if ((i28 & 2) != 0) {
                        i12 = 85;
                    } else {
                        i12 = 0;
                    }
                    if ((i28 & 32) != 0) {
                        i13 = 170;
                    } else {
                        i13 = 0;
                    }
                    int i44 = i12 + i13;
                    if ((i28 & 4) == 0) {
                        i32 = 0;
                    }
                    if ((i28 & 64) == 0) {
                        i31 = 0;
                    }
                    iArr[i28] = getColor(255, i43, i44, i32 + i31);
                }
            }
        }
        return iArr;
    }

    private static int getColor(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    private static int paint2BitPixelCodeString(ParsableBitArray parsableBitArray, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int i12;
        int readBits;
        int readBits2;
        int i13 = i10;
        boolean z11 = false;
        while (true) {
            int readBits3 = parsableBitArray.readBits(2);
            if (readBits3 != 0) {
                z10 = z11;
                i12 = 1;
            } else {
                if (parsableBitArray.readBit()) {
                    readBits = parsableBitArray.readBits(3) + 3;
                    readBits2 = parsableBitArray.readBits(2);
                } else {
                    if (parsableBitArray.readBit()) {
                        z10 = z11;
                        i12 = 1;
                    } else {
                        int readBits4 = parsableBitArray.readBits(2);
                        if (readBits4 != 0) {
                            if (readBits4 != 1) {
                                if (readBits4 != 2) {
                                    if (readBits4 != 3) {
                                        z10 = z11;
                                    } else {
                                        readBits = parsableBitArray.readBits(8) + 29;
                                        readBits2 = parsableBitArray.readBits(2);
                                    }
                                } else {
                                    readBits = parsableBitArray.readBits(4) + 12;
                                    readBits2 = parsableBitArray.readBits(2);
                                }
                            } else {
                                z10 = z11;
                                i12 = 2;
                            }
                        } else {
                            z10 = true;
                        }
                        readBits3 = 0;
                        i12 = 0;
                    }
                    readBits3 = 0;
                }
                z10 = z11;
                i12 = readBits;
                readBits3 = readBits2;
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    readBits3 = bArr[readBits3];
                }
                paint.setColor(iArr[readBits3]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z11 = z10;
        }
    }

    private static int paint4BitPixelCodeString(ParsableBitArray parsableBitArray, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int i12;
        int readBits;
        int readBits2;
        int i13 = i10;
        boolean z11 = false;
        while (true) {
            int readBits3 = parsableBitArray.readBits(4);
            if (readBits3 != 0) {
                z10 = z11;
                i12 = 1;
            } else if (!parsableBitArray.readBit()) {
                int readBits4 = parsableBitArray.readBits(3);
                if (readBits4 != 0) {
                    z10 = z11;
                    i12 = readBits4 + 2;
                    readBits3 = 0;
                } else {
                    z10 = true;
                    readBits3 = 0;
                    i12 = 0;
                }
            } else {
                if (!parsableBitArray.readBit()) {
                    readBits = parsableBitArray.readBits(2) + 4;
                    readBits2 = parsableBitArray.readBits(4);
                } else {
                    int readBits5 = parsableBitArray.readBits(2);
                    if (readBits5 != 0) {
                        if (readBits5 != 1) {
                            if (readBits5 != 2) {
                                if (readBits5 != 3) {
                                    z10 = z11;
                                    readBits3 = 0;
                                    i12 = 0;
                                } else {
                                    readBits = parsableBitArray.readBits(8) + 25;
                                    readBits2 = parsableBitArray.readBits(4);
                                }
                            } else {
                                readBits = parsableBitArray.readBits(4) + 9;
                                readBits2 = parsableBitArray.readBits(4);
                            }
                        } else {
                            z10 = z11;
                            i12 = 2;
                        }
                    } else {
                        z10 = z11;
                        i12 = 1;
                    }
                    readBits3 = 0;
                }
                z10 = z11;
                i12 = readBits;
                readBits3 = readBits2;
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    readBits3 = bArr[readBits3];
                }
                paint.setColor(iArr[readBits3]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z11 = z10;
        }
    }

    private static int paint8BitPixelCodeString(ParsableBitArray parsableBitArray, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int readBits;
        int i12 = i10;
        boolean z11 = false;
        while (true) {
            int readBits2 = parsableBitArray.readBits(8);
            if (readBits2 != 0) {
                z10 = z11;
                readBits = 1;
            } else if (!parsableBitArray.readBit()) {
                int readBits3 = parsableBitArray.readBits(7);
                if (readBits3 != 0) {
                    z10 = z11;
                    readBits = readBits3;
                    readBits2 = 0;
                } else {
                    z10 = true;
                    readBits2 = 0;
                    readBits = 0;
                }
            } else {
                z10 = z11;
                readBits = parsableBitArray.readBits(7);
                readBits2 = parsableBitArray.readBits(8);
            }
            if (readBits != 0 && paint != null) {
                if (bArr != null) {
                    readBits2 = bArr[readBits2];
                }
                paint.setColor(iArr[readBits2]);
                canvas.drawRect(i12, i11, i12 + readBits, i11 + 1, paint);
            }
            i12 += readBits;
            if (z10) {
                return i12;
            }
            z11 = z10;
        }
    }

    private static void paintPixelDataSubBlock(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        int i13 = i11;
        int i14 = i12;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        while (parsableBitArray.bitsLeft() != 0) {
            int readBits = parsableBitArray.readBits(8);
            if (readBits != 240) {
                switch (readBits) {
                    case 16:
                        if (i10 == 3) {
                            if (bArr5 == null) {
                                bArr3 = defaultMap2To8;
                            } else {
                                bArr3 = bArr5;
                            }
                        } else if (i10 == 2) {
                            if (bArr6 == null) {
                                bArr3 = defaultMap2To4;
                            } else {
                                bArr3 = bArr6;
                            }
                        } else {
                            bArr2 = null;
                            i13 = paint2BitPixelCodeString(parsableBitArray, iArr, bArr2, i13, i14, paint, canvas);
                            parsableBitArray.byteAlign();
                            break;
                        }
                        bArr2 = bArr3;
                        i13 = paint2BitPixelCodeString(parsableBitArray, iArr, bArr2, i13, i14, paint, canvas);
                        parsableBitArray.byteAlign();
                    case 17:
                        if (i10 == 3) {
                            bArr4 = defaultMap4To8;
                        } else {
                            bArr4 = null;
                        }
                        i13 = paint4BitPixelCodeString(parsableBitArray, iArr, bArr4, i13, i14, paint, canvas);
                        parsableBitArray.byteAlign();
                        break;
                    case 18:
                        i13 = paint8BitPixelCodeString(parsableBitArray, iArr, null, i13, i14, paint, canvas);
                        break;
                    default:
                        switch (readBits) {
                            case 32:
                                bArr6 = buildClutMapTable(4, 4, parsableBitArray);
                                break;
                            case 33:
                                bArr5 = buildClutMapTable(4, 8, parsableBitArray);
                                break;
                            case 34:
                                bArr5 = buildClutMapTable(16, 8, parsableBitArray);
                                break;
                        }
                }
            } else {
                i14 += 2;
                i13 = i11;
            }
        }
    }

    private static void paintPixelDataSubBlocks(ObjectData objectData, ClutDefinition clutDefinition, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i10 == 3) {
            iArr = clutDefinition.clutEntries8Bit;
        } else if (i10 == 2) {
            iArr = clutDefinition.clutEntries4Bit;
        } else {
            iArr = clutDefinition.clutEntries2Bit;
        }
        int[] iArr2 = iArr;
        paintPixelDataSubBlock(objectData.topFieldData, iArr2, i10, i11, i12, paint, canvas);
        paintPixelDataSubBlock(objectData.bottomFieldData, iArr2, i10, i11, i12 + 1, paint, canvas);
    }

    private static ClutDefinition parseClutDefinition(ParsableBitArray parsableBitArray, int i10) {
        int[] iArr;
        int readBits;
        int i11;
        int readBits2;
        int i12;
        int i13;
        int i14 = 8;
        int readBits3 = parsableBitArray.readBits(8);
        parsableBitArray.skipBits(8);
        int i15 = 2;
        int i16 = i10 - 2;
        int[] generateDefault2BitClutEntries = generateDefault2BitClutEntries();
        int[] generateDefault4BitClutEntries = generateDefault4BitClutEntries();
        int[] generateDefault8BitClutEntries = generateDefault8BitClutEntries();
        while (i16 > 0) {
            int readBits4 = parsableBitArray.readBits(i14);
            int readBits5 = parsableBitArray.readBits(i14);
            int i17 = i16 - 2;
            if ((readBits5 & 128) != 0) {
                iArr = generateDefault2BitClutEntries;
            } else if ((readBits5 & 64) != 0) {
                iArr = generateDefault4BitClutEntries;
            } else {
                iArr = generateDefault8BitClutEntries;
            }
            if ((readBits5 & 1) != 0) {
                i12 = parsableBitArray.readBits(i14);
                i13 = parsableBitArray.readBits(i14);
                readBits = parsableBitArray.readBits(i14);
                readBits2 = parsableBitArray.readBits(i14);
                i11 = i17 - 4;
            } else {
                int readBits6 = parsableBitArray.readBits(6) << i15;
                int readBits7 = parsableBitArray.readBits(4) << 4;
                readBits = parsableBitArray.readBits(4) << 4;
                i11 = i17 - 2;
                readBits2 = parsableBitArray.readBits(i15) << 6;
                i12 = readBits6;
                i13 = readBits7;
            }
            if (i12 == 0) {
                readBits2 = 255;
                i13 = 0;
                readBits = 0;
            }
            double d10 = i12;
            double d11 = i13 - 128;
            double d12 = readBits - 128;
            iArr[readBits4] = getColor((byte) (255 - (readBits2 & 255)), Util.constrainValue((int) ((1.402d * d11) + d10), 0, 255), Util.constrainValue((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), Util.constrainValue((int) ((d12 * 1.772d) + d10), 0, 255));
            i16 = i11;
            readBits3 = readBits3;
            i14 = 8;
            i15 = 2;
        }
        return new ClutDefinition(readBits3, generateDefault2BitClutEntries, generateDefault4BitClutEntries, generateDefault8BitClutEntries);
    }

    private static DisplayDefinition parseDisplayDefinition(ParsableBitArray parsableBitArray) {
        int i10;
        int i11;
        int i12;
        int i13;
        parsableBitArray.skipBits(4);
        boolean readBit = parsableBitArray.readBit();
        parsableBitArray.skipBits(3);
        int readBits = parsableBitArray.readBits(16);
        int readBits2 = parsableBitArray.readBits(16);
        if (readBit) {
            int readBits3 = parsableBitArray.readBits(16);
            int readBits4 = parsableBitArray.readBits(16);
            int readBits5 = parsableBitArray.readBits(16);
            i13 = parsableBitArray.readBits(16);
            i12 = readBits4;
            i11 = readBits5;
            i10 = readBits3;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = readBits;
            i13 = readBits2;
        }
        return new DisplayDefinition(readBits, readBits2, i10, i12, i11, i13);
    }

    private static ObjectData parseObjectData(ParsableBitArray parsableBitArray) {
        byte[] bArr;
        int readBits = parsableBitArray.readBits(16);
        parsableBitArray.skipBits(4);
        int readBits2 = parsableBitArray.readBits(2);
        boolean readBit = parsableBitArray.readBit();
        parsableBitArray.skipBits(1);
        byte[] bArr2 = null;
        if (readBits2 == 1) {
            parsableBitArray.skipBits(parsableBitArray.readBits(8) * 16);
        } else if (readBits2 == 0) {
            int readBits3 = parsableBitArray.readBits(16);
            int readBits4 = parsableBitArray.readBits(16);
            if (readBits3 > 0) {
                bArr2 = new byte[readBits3];
                parsableBitArray.readBytes(bArr2, 0, readBits3);
            }
            if (readBits4 > 0) {
                bArr = new byte[readBits4];
                parsableBitArray.readBytes(bArr, 0, readBits4);
                return new ObjectData(readBits, readBit, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new ObjectData(readBits, readBit, bArr2, bArr);
    }

    private static PageComposition parsePageComposition(ParsableBitArray parsableBitArray, int i10) {
        int readBits = parsableBitArray.readBits(8);
        int readBits2 = parsableBitArray.readBits(4);
        int readBits3 = parsableBitArray.readBits(2);
        parsableBitArray.skipBits(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int readBits4 = parsableBitArray.readBits(8);
            parsableBitArray.skipBits(8);
            i11 -= 6;
            sparseArray.put(readBits4, new PageRegion(parsableBitArray.readBits(16), parsableBitArray.readBits(16)));
        }
        return new PageComposition(readBits, readBits2, readBits3, sparseArray);
    }

    private static RegionComposition parseRegionComposition(ParsableBitArray parsableBitArray, int i10) {
        int readBits;
        int readBits2;
        int readBits3 = parsableBitArray.readBits(8);
        parsableBitArray.skipBits(4);
        boolean readBit = parsableBitArray.readBit();
        parsableBitArray.skipBits(3);
        int i11 = 16;
        int readBits4 = parsableBitArray.readBits(16);
        int readBits5 = parsableBitArray.readBits(16);
        int readBits6 = parsableBitArray.readBits(3);
        int readBits7 = parsableBitArray.readBits(3);
        int i12 = 2;
        parsableBitArray.skipBits(2);
        int readBits8 = parsableBitArray.readBits(8);
        int readBits9 = parsableBitArray.readBits(8);
        int readBits10 = parsableBitArray.readBits(4);
        int readBits11 = parsableBitArray.readBits(2);
        parsableBitArray.skipBits(2);
        int i13 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i13 > 0) {
            int readBits12 = parsableBitArray.readBits(i11);
            int readBits13 = parsableBitArray.readBits(i12);
            int readBits14 = parsableBitArray.readBits(i12);
            int readBits15 = parsableBitArray.readBits(12);
            int i14 = readBits11;
            parsableBitArray.skipBits(4);
            int readBits16 = parsableBitArray.readBits(12);
            i13 -= 6;
            if (readBits13 != 1 && readBits13 != 2) {
                readBits = 0;
                readBits2 = 0;
            } else {
                i13 -= 2;
                readBits = parsableBitArray.readBits(8);
                readBits2 = parsableBitArray.readBits(8);
            }
            sparseArray.put(readBits12, new RegionObject(readBits13, readBits14, readBits15, readBits16, readBits, readBits2));
            readBits11 = i14;
            i12 = 2;
            i11 = 16;
        }
        return new RegionComposition(readBits3, readBit, readBits4, readBits5, readBits6, readBits7, readBits8, readBits9, readBits10, readBits11, sparseArray);
    }

    private static void parseSubtitlingSegment(ParsableBitArray parsableBitArray, SubtitleService subtitleService) {
        int readBits = parsableBitArray.readBits(8);
        int readBits2 = parsableBitArray.readBits(16);
        int readBits3 = parsableBitArray.readBits(16);
        int bytePosition = parsableBitArray.getBytePosition() + readBits3;
        if (readBits3 * 8 > parsableBitArray.bitsLeft()) {
            Log.w(TAG, "Data field length exceeds limit");
            parsableBitArray.skipBits(parsableBitArray.bitsLeft());
            return;
        }
        switch (readBits) {
            case 16:
                if (readBits2 == subtitleService.subtitlePageId) {
                    PageComposition pageComposition = subtitleService.pageComposition;
                    PageComposition parsePageComposition = parsePageComposition(parsableBitArray, readBits3);
                    if (parsePageComposition.state != 0) {
                        subtitleService.pageComposition = parsePageComposition;
                        subtitleService.regions.clear();
                        subtitleService.cluts.clear();
                        subtitleService.objects.clear();
                        break;
                    } else if (pageComposition != null && pageComposition.version != parsePageComposition.version) {
                        subtitleService.pageComposition = parsePageComposition;
                        break;
                    }
                }
                break;
            case 17:
                PageComposition pageComposition2 = subtitleService.pageComposition;
                if (readBits2 == subtitleService.subtitlePageId && pageComposition2 != null) {
                    RegionComposition parseRegionComposition = parseRegionComposition(parsableBitArray, readBits3);
                    if (pageComposition2.state == 0) {
                        parseRegionComposition.mergeFrom(subtitleService.regions.get(parseRegionComposition.f14738id));
                    }
                    subtitleService.regions.put(parseRegionComposition.f14738id, parseRegionComposition);
                    break;
                }
                break;
            case 18:
                if (readBits2 == subtitleService.subtitlePageId) {
                    ClutDefinition parseClutDefinition = parseClutDefinition(parsableBitArray, readBits3);
                    subtitleService.cluts.put(parseClutDefinition.f14736id, parseClutDefinition);
                    break;
                } else if (readBits2 == subtitleService.ancillaryPageId) {
                    ClutDefinition parseClutDefinition2 = parseClutDefinition(parsableBitArray, readBits3);
                    subtitleService.ancillaryCluts.put(parseClutDefinition2.f14736id, parseClutDefinition2);
                    break;
                }
                break;
            case 19:
                if (readBits2 == subtitleService.subtitlePageId) {
                    ObjectData parseObjectData = parseObjectData(parsableBitArray);
                    subtitleService.objects.put(parseObjectData.f14737id, parseObjectData);
                    break;
                } else if (readBits2 == subtitleService.ancillaryPageId) {
                    ObjectData parseObjectData2 = parseObjectData(parsableBitArray);
                    subtitleService.ancillaryObjects.put(parseObjectData2.f14737id, parseObjectData2);
                    break;
                }
                break;
            case 20:
                if (readBits2 == subtitleService.subtitlePageId) {
                    subtitleService.displayDefinition = parseDisplayDefinition(parsableBitArray);
                    break;
                }
                break;
        }
        parsableBitArray.skipBytes(bytePosition - parsableBitArray.getBytePosition());
    }

    public final List<Cue> decode(byte[] bArr, int i10) {
        int i11;
        ObjectData objectData;
        int i12;
        SparseArray<RegionObject> sparseArray;
        Paint paint;
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr, i10);
        while (parsableBitArray.bitsLeft() >= 48 && parsableBitArray.readBits(8) == 15) {
            parseSubtitlingSegment(parsableBitArray, this.subtitleService);
        }
        SubtitleService subtitleService = this.subtitleService;
        if (subtitleService.pageComposition == null) {
            return Collections.emptyList();
        }
        DisplayDefinition displayDefinition = subtitleService.displayDefinition;
        if (displayDefinition == null) {
            displayDefinition = this.defaultDisplayDefinition;
        }
        Bitmap bitmap = this.bitmap;
        if (bitmap == null || displayDefinition.width + 1 != bitmap.getWidth() || displayDefinition.height + 1 != this.bitmap.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(displayDefinition.width + 1, displayDefinition.height + 1, Bitmap.Config.ARGB_8888);
            this.bitmap = createBitmap;
            this.canvas.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<PageRegion> sparseArray2 = this.subtitleService.pageComposition.regions;
        for (int i13 = 0; i13 < sparseArray2.size(); i13++) {
            PageRegion valueAt = sparseArray2.valueAt(i13);
            RegionComposition regionComposition = this.subtitleService.regions.get(sparseArray2.keyAt(i13));
            int i14 = valueAt.horizontalAddress + displayDefinition.horizontalPositionMinimum;
            int i15 = valueAt.verticalAddress + displayDefinition.verticalPositionMinimum;
            float f10 = i14;
            float f11 = i15;
            this.canvas.clipRect(f10, f11, Math.min(regionComposition.width + i14, displayDefinition.horizontalPositionMaximum), Math.min(regionComposition.height + i15, displayDefinition.verticalPositionMaximum), Region.Op.REPLACE);
            ClutDefinition clutDefinition = this.subtitleService.cluts.get(regionComposition.clutId);
            if (clutDefinition == null && (clutDefinition = this.subtitleService.ancillaryCluts.get(regionComposition.clutId)) == null) {
                clutDefinition = this.defaultClutDefinition;
            }
            SparseArray<RegionObject> sparseArray3 = regionComposition.regionObjects;
            int i16 = 0;
            while (i16 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i16);
                RegionObject valueAt2 = sparseArray3.valueAt(i16);
                ObjectData objectData2 = this.subtitleService.objects.get(keyAt);
                if (objectData2 == null) {
                    objectData = this.subtitleService.ancillaryObjects.get(keyAt);
                } else {
                    objectData = objectData2;
                }
                if (objectData != null) {
                    if (objectData.nonModifyingColorFlag) {
                        paint = null;
                    } else {
                        paint = this.defaultPaint;
                    }
                    i12 = i16;
                    sparseArray = sparseArray3;
                    paintPixelDataSubBlocks(objectData, clutDefinition, regionComposition.depth, valueAt2.horizontalPosition + i14, i15 + valueAt2.verticalPosition, paint, this.canvas);
                } else {
                    i12 = i16;
                    sparseArray = sparseArray3;
                }
                i16 = i12 + 1;
                sparseArray3 = sparseArray;
            }
            if (regionComposition.fillFlag) {
                int i17 = regionComposition.depth;
                if (i17 == 3) {
                    i11 = clutDefinition.clutEntries8Bit[regionComposition.pixelCode8Bit];
                } else if (i17 == 2) {
                    i11 = clutDefinition.clutEntries4Bit[regionComposition.pixelCode4Bit];
                } else {
                    i11 = clutDefinition.clutEntries2Bit[regionComposition.pixelCode2Bit];
                }
                this.fillRegionPaint.setColor(i11);
                this.canvas.drawRect(f10, f11, regionComposition.width + i14, regionComposition.height + i15, this.fillRegionPaint);
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(this.bitmap, i14, i15, regionComposition.width, regionComposition.height);
            int i18 = displayDefinition.width;
            int i19 = displayDefinition.height;
            arrayList.add(new Cue(createBitmap2, f10 / i18, 0, f11 / i19, 0, regionComposition.width / i18, regionComposition.height / i19));
            this.canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        return arrayList;
    }

    public final void reset() {
        this.subtitleService.reset();
    }
}
