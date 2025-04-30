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

/* loaded from: classes3.dex */
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

    /* loaded from: classes3.dex */
    public static final class ClutDefinition {
        public final int[] clutEntries2Bit;
        public final int[] clutEntries4Bit;
        public final int[] clutEntries8Bit;
        public final int id;

        public ClutDefinition(int i9, int[] iArr, int[] iArr2, int[] iArr3) {
            this.id = i9;
            this.clutEntries2Bit = iArr;
            this.clutEntries4Bit = iArr2;
            this.clutEntries8Bit = iArr3;
        }
    }

    /* loaded from: classes3.dex */
    public static final class DisplayDefinition {
        public final int height;
        public final int horizontalPositionMaximum;
        public final int horizontalPositionMinimum;
        public final int verticalPositionMaximum;
        public final int verticalPositionMinimum;
        public final int width;

        public DisplayDefinition(int i9, int i10, int i11, int i12, int i13, int i14) {
            this.width = i9;
            this.height = i10;
            this.horizontalPositionMinimum = i11;
            this.horizontalPositionMaximum = i12;
            this.verticalPositionMinimum = i13;
            this.verticalPositionMaximum = i14;
        }
    }

    /* loaded from: classes3.dex */
    public static final class ObjectData {
        public final byte[] bottomFieldData;
        public final int id;
        public final boolean nonModifyingColorFlag;
        public final byte[] topFieldData;

        public ObjectData(int i9, boolean z8, byte[] bArr, byte[] bArr2) {
            this.id = i9;
            this.nonModifyingColorFlag = z8;
            this.topFieldData = bArr;
            this.bottomFieldData = bArr2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class PageComposition {
        public final SparseArray<PageRegion> regions;
        public final int state;
        public final int timeOutSecs;
        public final int version;

        public PageComposition(int i9, int i10, int i11, SparseArray<PageRegion> sparseArray) {
            this.timeOutSecs = i9;
            this.version = i10;
            this.state = i11;
            this.regions = sparseArray;
        }
    }

    /* loaded from: classes3.dex */
    public static final class PageRegion {
        public final int horizontalAddress;
        public final int verticalAddress;

        public PageRegion(int i9, int i10) {
            this.horizontalAddress = i9;
            this.verticalAddress = i10;
        }
    }

    /* loaded from: classes3.dex */
    public static final class RegionComposition {
        public final int clutId;
        public final int depth;
        public final boolean fillFlag;
        public final int height;
        public final int id;
        public final int levelOfCompatibility;
        public final int pixelCode2Bit;
        public final int pixelCode4Bit;
        public final int pixelCode8Bit;
        public final SparseArray<RegionObject> regionObjects;
        public final int width;

        public RegionComposition(int i9, boolean z8, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, SparseArray<RegionObject> sparseArray) {
            this.id = i9;
            this.fillFlag = z8;
            this.width = i10;
            this.height = i11;
            this.levelOfCompatibility = i12;
            this.depth = i13;
            this.clutId = i14;
            this.pixelCode8Bit = i15;
            this.pixelCode4Bit = i16;
            this.pixelCode2Bit = i17;
            this.regionObjects = sparseArray;
        }

        public final void mergeFrom(RegionComposition regionComposition) {
            if (regionComposition == null) {
                return;
            }
            SparseArray<RegionObject> sparseArray = regionComposition.regionObjects;
            for (int i9 = 0; i9 < sparseArray.size(); i9++) {
                this.regionObjects.put(sparseArray.keyAt(i9), sparseArray.valueAt(i9));
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class RegionObject {
        public final int backgroundPixelCode;
        public final int foregroundPixelCode;
        public final int horizontalPosition;
        public final int provider;
        public final int type;
        public final int verticalPosition;

        public RegionObject(int i9, int i10, int i11, int i12, int i13, int i14) {
            this.type = i9;
            this.provider = i10;
            this.horizontalPosition = i11;
            this.verticalPosition = i12;
            this.foregroundPixelCode = i13;
            this.backgroundPixelCode = i14;
        }
    }

    /* loaded from: classes3.dex */
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

        public SubtitleService(int i9, int i10) {
            this.subtitlePageId = i9;
            this.ancillaryPageId = i10;
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

    public DvbParser(int i9, int i10) {
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
        this.subtitleService = new SubtitleService(i9, i10);
    }

    private static byte[] buildClutMapTable(int i9, int i10, ParsableBitArray parsableBitArray) {
        byte[] bArr = new byte[i9];
        for (int i11 = 0; i11 < i9; i11++) {
            bArr[i11] = (byte) parsableBitArray.readBits(i10);
        }
        return bArr;
    }

    private static int[] generateDefault2BitClutEntries() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    private static int[] generateDefault4BitClutEntries() {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i14 = 1; i14 < 16; i14++) {
            if (i14 < 8) {
                if ((i14 & 1) != 0) {
                    i11 = 255;
                } else {
                    i11 = 0;
                }
                if ((i14 & 2) != 0) {
                    i12 = 255;
                } else {
                    i12 = 0;
                }
                if ((i14 & 4) != 0) {
                    i13 = 255;
                } else {
                    i13 = 0;
                }
                iArr[i14] = getColor(255, i11, i12, i13);
            } else {
                int i15 = 127;
                if ((i14 & 1) != 0) {
                    i9 = 127;
                } else {
                    i9 = 0;
                }
                if ((i14 & 2) != 0) {
                    i10 = 127;
                } else {
                    i10 = 0;
                }
                if ((i14 & 4) == 0) {
                    i15 = 0;
                }
                iArr[i14] = getColor(255, i9, i10, i15);
            }
        }
        return iArr;
    }

    private static int[] generateDefault8BitClutEntries() {
        int i9;
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
        int[] iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        iArr[0] = 0;
        for (int i27 = 0; i27 < 256; i27++) {
            int i28 = 255;
            if (i27 < 8) {
                if ((i27 & 1) != 0) {
                    i25 = 255;
                } else {
                    i25 = 0;
                }
                if ((i27 & 2) != 0) {
                    i26 = 255;
                } else {
                    i26 = 0;
                }
                if ((i27 & 4) == 0) {
                    i28 = 0;
                }
                iArr[i27] = getColor(63, i25, i26, i28);
            } else {
                int i29 = i27 & 136;
                int i30 = 170;
                int i31 = 85;
                if (i29 != 0) {
                    if (i29 != 8) {
                        int i32 = 43;
                        if (i29 != 128) {
                            if (i29 == 136) {
                                if ((i27 & 1) != 0) {
                                    i21 = 43;
                                } else {
                                    i21 = 0;
                                }
                                if ((i27 & 16) != 0) {
                                    i22 = 85;
                                } else {
                                    i22 = 0;
                                }
                                int i33 = i21 + i22;
                                if ((i27 & 2) != 0) {
                                    i23 = 43;
                                } else {
                                    i23 = 0;
                                }
                                if ((i27 & 32) != 0) {
                                    i24 = 85;
                                } else {
                                    i24 = 0;
                                }
                                int i34 = i23 + i24;
                                if ((i27 & 4) == 0) {
                                    i32 = 0;
                                }
                                if ((i27 & 64) == 0) {
                                    i31 = 0;
                                }
                                iArr[i27] = getColor(255, i33, i34, i32 + i31);
                            }
                        } else {
                            if ((i27 & 1) != 0) {
                                i17 = 43;
                            } else {
                                i17 = 0;
                            }
                            int i35 = i17 + 127;
                            if ((i27 & 16) != 0) {
                                i18 = 85;
                            } else {
                                i18 = 0;
                            }
                            int i36 = i35 + i18;
                            if ((i27 & 2) != 0) {
                                i19 = 43;
                            } else {
                                i19 = 0;
                            }
                            int i37 = i19 + 127;
                            if ((i27 & 32) != 0) {
                                i20 = 85;
                            } else {
                                i20 = 0;
                            }
                            int i38 = i37 + i20;
                            if ((i27 & 4) == 0) {
                                i32 = 0;
                            }
                            int i39 = i32 + 127;
                            if ((i27 & 64) == 0) {
                                i31 = 0;
                            }
                            iArr[i27] = getColor(255, i36, i38, i39 + i31);
                        }
                    } else {
                        if ((i27 & 1) != 0) {
                            i13 = 85;
                        } else {
                            i13 = 0;
                        }
                        if ((i27 & 16) != 0) {
                            i14 = 170;
                        } else {
                            i14 = 0;
                        }
                        int i40 = i13 + i14;
                        if ((i27 & 2) != 0) {
                            i15 = 85;
                        } else {
                            i15 = 0;
                        }
                        if ((i27 & 32) != 0) {
                            i16 = 170;
                        } else {
                            i16 = 0;
                        }
                        int i41 = i15 + i16;
                        if ((i27 & 4) == 0) {
                            i31 = 0;
                        }
                        if ((i27 & 64) == 0) {
                            i30 = 0;
                        }
                        iArr[i27] = getColor(127, i40, i41, i31 + i30);
                    }
                } else {
                    if ((i27 & 1) != 0) {
                        i9 = 85;
                    } else {
                        i9 = 0;
                    }
                    if ((i27 & 16) != 0) {
                        i10 = 170;
                    } else {
                        i10 = 0;
                    }
                    int i42 = i9 + i10;
                    if ((i27 & 2) != 0) {
                        i11 = 85;
                    } else {
                        i11 = 0;
                    }
                    if ((i27 & 32) != 0) {
                        i12 = 170;
                    } else {
                        i12 = 0;
                    }
                    int i43 = i11 + i12;
                    if ((i27 & 4) == 0) {
                        i31 = 0;
                    }
                    if ((i27 & 64) == 0) {
                        i30 = 0;
                    }
                    iArr[i27] = getColor(255, i42, i43, i31 + i30);
                }
            }
        }
        return iArr;
    }

    private static int getColor(int i9, int i10, int i11, int i12) {
        return (i9 << 24) | (i10 << 16) | (i11 << 8) | i12;
    }

    private static int paint2BitPixelCodeString(ParsableBitArray parsableBitArray, int[] iArr, byte[] bArr, int i9, int i10, Paint paint, Canvas canvas) {
        boolean z8;
        int i11;
        int readBits;
        int readBits2;
        int i12 = i9;
        boolean z9 = false;
        while (true) {
            int readBits3 = parsableBitArray.readBits(2);
            if (readBits3 != 0) {
                z8 = z9;
                i11 = 1;
            } else {
                if (parsableBitArray.readBit()) {
                    readBits = parsableBitArray.readBits(3) + 3;
                    readBits2 = parsableBitArray.readBits(2);
                } else {
                    if (parsableBitArray.readBit()) {
                        z8 = z9;
                        i11 = 1;
                    } else {
                        int readBits4 = parsableBitArray.readBits(2);
                        if (readBits4 != 0) {
                            if (readBits4 != 1) {
                                if (readBits4 != 2) {
                                    if (readBits4 != 3) {
                                        z8 = z9;
                                    } else {
                                        readBits = parsableBitArray.readBits(8) + 29;
                                        readBits2 = parsableBitArray.readBits(2);
                                    }
                                } else {
                                    readBits = parsableBitArray.readBits(4) + 12;
                                    readBits2 = parsableBitArray.readBits(2);
                                }
                            } else {
                                z8 = z9;
                                i11 = 2;
                            }
                        } else {
                            z8 = true;
                        }
                        readBits3 = 0;
                        i11 = 0;
                    }
                    readBits3 = 0;
                }
                z8 = z9;
                i11 = readBits;
                readBits3 = readBits2;
            }
            if (i11 != 0 && paint != null) {
                if (bArr != null) {
                    readBits3 = bArr[readBits3];
                }
                paint.setColor(iArr[readBits3]);
                canvas.drawRect(i12, i10, i12 + i11, i10 + 1, paint);
            }
            i12 += i11;
            if (z8) {
                return i12;
            }
            z9 = z8;
        }
    }

    private static int paint4BitPixelCodeString(ParsableBitArray parsableBitArray, int[] iArr, byte[] bArr, int i9, int i10, Paint paint, Canvas canvas) {
        boolean z8;
        int i11;
        int readBits;
        int readBits2;
        int i12 = i9;
        boolean z9 = false;
        while (true) {
            int readBits3 = parsableBitArray.readBits(4);
            if (readBits3 != 0) {
                z8 = z9;
                i11 = 1;
            } else if (!parsableBitArray.readBit()) {
                int readBits4 = parsableBitArray.readBits(3);
                if (readBits4 != 0) {
                    z8 = z9;
                    i11 = readBits4 + 2;
                    readBits3 = 0;
                } else {
                    z8 = true;
                    readBits3 = 0;
                    i11 = 0;
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
                                    z8 = z9;
                                    readBits3 = 0;
                                    i11 = 0;
                                } else {
                                    readBits = parsableBitArray.readBits(8) + 25;
                                    readBits2 = parsableBitArray.readBits(4);
                                }
                            } else {
                                readBits = parsableBitArray.readBits(4) + 9;
                                readBits2 = parsableBitArray.readBits(4);
                            }
                        } else {
                            z8 = z9;
                            i11 = 2;
                        }
                    } else {
                        z8 = z9;
                        i11 = 1;
                    }
                    readBits3 = 0;
                }
                z8 = z9;
                i11 = readBits;
                readBits3 = readBits2;
            }
            if (i11 != 0 && paint != null) {
                if (bArr != null) {
                    readBits3 = bArr[readBits3];
                }
                paint.setColor(iArr[readBits3]);
                canvas.drawRect(i12, i10, i12 + i11, i10 + 1, paint);
            }
            i12 += i11;
            if (z8) {
                return i12;
            }
            z9 = z8;
        }
    }

    private static int paint8BitPixelCodeString(ParsableBitArray parsableBitArray, int[] iArr, byte[] bArr, int i9, int i10, Paint paint, Canvas canvas) {
        boolean z8;
        int readBits;
        int i11 = i9;
        boolean z9 = false;
        while (true) {
            int readBits2 = parsableBitArray.readBits(8);
            if (readBits2 != 0) {
                z8 = z9;
                readBits = 1;
            } else if (!parsableBitArray.readBit()) {
                int readBits3 = parsableBitArray.readBits(7);
                if (readBits3 != 0) {
                    z8 = z9;
                    readBits = readBits3;
                    readBits2 = 0;
                } else {
                    z8 = true;
                    readBits2 = 0;
                    readBits = 0;
                }
            } else {
                z8 = z9;
                readBits = parsableBitArray.readBits(7);
                readBits2 = parsableBitArray.readBits(8);
            }
            if (readBits != 0 && paint != null) {
                if (bArr != null) {
                    readBits2 = bArr[readBits2];
                }
                paint.setColor(iArr[readBits2]);
                canvas.drawRect(i11, i10, i11 + readBits, i10 + 1, paint);
            }
            i11 += readBits;
            if (z8) {
                return i11;
            }
            z9 = z8;
        }
    }

    private static void paintPixelDataSubBlock(byte[] bArr, int[] iArr, int i9, int i10, int i11, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        int i12 = i10;
        int i13 = i11;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        while (parsableBitArray.bitsLeft() != 0) {
            int readBits = parsableBitArray.readBits(8);
            if (readBits != 240) {
                switch (readBits) {
                    case 16:
                        if (i9 == 3) {
                            if (bArr5 == null) {
                                bArr3 = defaultMap2To8;
                            } else {
                                bArr3 = bArr5;
                            }
                        } else if (i9 == 2) {
                            if (bArr6 == null) {
                                bArr3 = defaultMap2To4;
                            } else {
                                bArr3 = bArr6;
                            }
                        } else {
                            bArr2 = null;
                            i12 = paint2BitPixelCodeString(parsableBitArray, iArr, bArr2, i12, i13, paint, canvas);
                            parsableBitArray.byteAlign();
                            break;
                        }
                        bArr2 = bArr3;
                        i12 = paint2BitPixelCodeString(parsableBitArray, iArr, bArr2, i12, i13, paint, canvas);
                        parsableBitArray.byteAlign();
                    case 17:
                        if (i9 == 3) {
                            bArr4 = defaultMap4To8;
                        } else {
                            bArr4 = null;
                        }
                        i12 = paint4BitPixelCodeString(parsableBitArray, iArr, bArr4, i12, i13, paint, canvas);
                        parsableBitArray.byteAlign();
                        break;
                    case 18:
                        i12 = paint8BitPixelCodeString(parsableBitArray, iArr, null, i12, i13, paint, canvas);
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
                i13 += 2;
                i12 = i10;
            }
        }
    }

    private static void paintPixelDataSubBlocks(ObjectData objectData, ClutDefinition clutDefinition, int i9, int i10, int i11, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i9 == 3) {
            iArr = clutDefinition.clutEntries8Bit;
        } else if (i9 == 2) {
            iArr = clutDefinition.clutEntries4Bit;
        } else {
            iArr = clutDefinition.clutEntries2Bit;
        }
        int[] iArr2 = iArr;
        paintPixelDataSubBlock(objectData.topFieldData, iArr2, i9, i10, i11, paint, canvas);
        paintPixelDataSubBlock(objectData.bottomFieldData, iArr2, i9, i10, i11 + 1, paint, canvas);
    }

    private static ClutDefinition parseClutDefinition(ParsableBitArray parsableBitArray, int i9) {
        int[] iArr;
        int readBits;
        int i10;
        int readBits2;
        int i11;
        int i12;
        int i13 = 8;
        int readBits3 = parsableBitArray.readBits(8);
        parsableBitArray.skipBits(8);
        int i14 = 2;
        int i15 = i9 - 2;
        int[] generateDefault2BitClutEntries = generateDefault2BitClutEntries();
        int[] generateDefault4BitClutEntries = generateDefault4BitClutEntries();
        int[] generateDefault8BitClutEntries = generateDefault8BitClutEntries();
        while (i15 > 0) {
            int readBits4 = parsableBitArray.readBits(i13);
            int readBits5 = parsableBitArray.readBits(i13);
            if ((readBits5 & 128) != 0) {
                iArr = generateDefault2BitClutEntries;
            } else if ((readBits5 & 64) != 0) {
                iArr = generateDefault4BitClutEntries;
            } else {
                iArr = generateDefault8BitClutEntries;
            }
            if ((readBits5 & 1) != 0) {
                i11 = parsableBitArray.readBits(i13);
                i12 = parsableBitArray.readBits(i13);
                readBits = parsableBitArray.readBits(i13);
                readBits2 = parsableBitArray.readBits(i13);
                i10 = i15 - 6;
            } else {
                int readBits6 = parsableBitArray.readBits(6) << i14;
                int readBits7 = parsableBitArray.readBits(4) << 4;
                readBits = parsableBitArray.readBits(4) << 4;
                i10 = i15 - 4;
                readBits2 = parsableBitArray.readBits(i14) << 6;
                i11 = readBits6;
                i12 = readBits7;
            }
            if (i11 == 0) {
                readBits2 = 255;
                i12 = 0;
                readBits = 0;
            }
            double d2 = i11;
            double d9 = i12 - 128;
            double d10 = readBits - 128;
            iArr[readBits4] = getColor((byte) (255 - (readBits2 & 255)), Util.constrainValue((int) ((1.402d * d9) + d2), 0, 255), Util.constrainValue((int) ((d2 - (0.34414d * d10)) - (d9 * 0.71414d)), 0, 255), Util.constrainValue((int) ((d10 * 1.772d) + d2), 0, 255));
            i15 = i10;
            readBits3 = readBits3;
            i13 = 8;
            i14 = 2;
        }
        return new ClutDefinition(readBits3, generateDefault2BitClutEntries, generateDefault4BitClutEntries, generateDefault8BitClutEntries);
    }

    private static DisplayDefinition parseDisplayDefinition(ParsableBitArray parsableBitArray) {
        int i9;
        int i10;
        int i11;
        int i12;
        parsableBitArray.skipBits(4);
        boolean readBit = parsableBitArray.readBit();
        parsableBitArray.skipBits(3);
        int readBits = parsableBitArray.readBits(16);
        int readBits2 = parsableBitArray.readBits(16);
        if (readBit) {
            int readBits3 = parsableBitArray.readBits(16);
            int readBits4 = parsableBitArray.readBits(16);
            int readBits5 = parsableBitArray.readBits(16);
            i12 = parsableBitArray.readBits(16);
            i11 = readBits4;
            i10 = readBits5;
            i9 = readBits3;
        } else {
            i9 = 0;
            i10 = 0;
            i11 = readBits;
            i12 = readBits2;
        }
        return new DisplayDefinition(readBits, readBits2, i9, i11, i10, i12);
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

    private static PageComposition parsePageComposition(ParsableBitArray parsableBitArray, int i9) {
        int readBits = parsableBitArray.readBits(8);
        int readBits2 = parsableBitArray.readBits(4);
        int readBits3 = parsableBitArray.readBits(2);
        parsableBitArray.skipBits(2);
        int i10 = i9 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i10 > 0) {
            int readBits4 = parsableBitArray.readBits(8);
            parsableBitArray.skipBits(8);
            i10 -= 6;
            sparseArray.put(readBits4, new PageRegion(parsableBitArray.readBits(16), parsableBitArray.readBits(16)));
        }
        return new PageComposition(readBits, readBits2, readBits3, sparseArray);
    }

    private static RegionComposition parseRegionComposition(ParsableBitArray parsableBitArray, int i9) {
        int i10;
        int i11;
        int i12;
        int readBits = parsableBitArray.readBits(8);
        parsableBitArray.skipBits(4);
        boolean readBit = parsableBitArray.readBit();
        parsableBitArray.skipBits(3);
        int i13 = 16;
        int readBits2 = parsableBitArray.readBits(16);
        int readBits3 = parsableBitArray.readBits(16);
        int readBits4 = parsableBitArray.readBits(3);
        int readBits5 = parsableBitArray.readBits(3);
        int i14 = 2;
        parsableBitArray.skipBits(2);
        int readBits6 = parsableBitArray.readBits(8);
        int readBits7 = parsableBitArray.readBits(8);
        int readBits8 = parsableBitArray.readBits(4);
        int readBits9 = parsableBitArray.readBits(2);
        parsableBitArray.skipBits(2);
        int i15 = i9 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i15 > 0) {
            int readBits10 = parsableBitArray.readBits(i13);
            int readBits11 = parsableBitArray.readBits(i14);
            int readBits12 = parsableBitArray.readBits(i14);
            int readBits13 = parsableBitArray.readBits(12);
            int i16 = readBits9;
            parsableBitArray.skipBits(4);
            int readBits14 = parsableBitArray.readBits(12);
            int i17 = i15 - 6;
            if (readBits11 != 1) {
                i10 = 2;
                if (readBits11 != 2) {
                    i12 = 0;
                    i11 = 0;
                    i15 = i17;
                    sparseArray.put(readBits10, new RegionObject(readBits11, readBits12, readBits13, readBits14, i12, i11));
                    i14 = i10;
                    readBits9 = i16;
                    i13 = 16;
                }
            } else {
                i10 = 2;
            }
            i15 -= 8;
            i12 = parsableBitArray.readBits(8);
            i11 = parsableBitArray.readBits(8);
            sparseArray.put(readBits10, new RegionObject(readBits11, readBits12, readBits13, readBits14, i12, i11));
            i14 = i10;
            readBits9 = i16;
            i13 = 16;
        }
        return new RegionComposition(readBits, readBit, readBits2, readBits3, readBits4, readBits5, readBits6, readBits7, readBits8, readBits9, sparseArray);
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
                        parseRegionComposition.mergeFrom(subtitleService.regions.get(parseRegionComposition.id));
                    }
                    subtitleService.regions.put(parseRegionComposition.id, parseRegionComposition);
                    break;
                }
                break;
            case 18:
                if (readBits2 == subtitleService.subtitlePageId) {
                    ClutDefinition parseClutDefinition = parseClutDefinition(parsableBitArray, readBits3);
                    subtitleService.cluts.put(parseClutDefinition.id, parseClutDefinition);
                    break;
                } else if (readBits2 == subtitleService.ancillaryPageId) {
                    ClutDefinition parseClutDefinition2 = parseClutDefinition(parsableBitArray, readBits3);
                    subtitleService.ancillaryCluts.put(parseClutDefinition2.id, parseClutDefinition2);
                    break;
                }
                break;
            case 19:
                if (readBits2 == subtitleService.subtitlePageId) {
                    ObjectData parseObjectData = parseObjectData(parsableBitArray);
                    subtitleService.objects.put(parseObjectData.id, parseObjectData);
                    break;
                } else if (readBits2 == subtitleService.ancillaryPageId) {
                    ObjectData parseObjectData2 = parseObjectData(parsableBitArray);
                    subtitleService.ancillaryObjects.put(parseObjectData2.id, parseObjectData2);
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

    public final List<Cue> decode(byte[] bArr, int i9) {
        int i10;
        ObjectData objectData;
        int i11;
        SparseArray<RegionObject> sparseArray;
        Paint paint;
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr, i9);
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
        for (int i12 = 0; i12 < sparseArray2.size(); i12++) {
            PageRegion valueAt = sparseArray2.valueAt(i12);
            RegionComposition regionComposition = this.subtitleService.regions.get(sparseArray2.keyAt(i12));
            int i13 = valueAt.horizontalAddress + displayDefinition.horizontalPositionMinimum;
            int i14 = valueAt.verticalAddress + displayDefinition.verticalPositionMinimum;
            float f9 = i13;
            float f10 = i14;
            this.canvas.clipRect(f9, f10, Math.min(regionComposition.width + i13, displayDefinition.horizontalPositionMaximum), Math.min(regionComposition.height + i14, displayDefinition.verticalPositionMaximum), Region.Op.REPLACE);
            ClutDefinition clutDefinition = this.subtitleService.cluts.get(regionComposition.clutId);
            if (clutDefinition == null && (clutDefinition = this.subtitleService.ancillaryCluts.get(regionComposition.clutId)) == null) {
                clutDefinition = this.defaultClutDefinition;
            }
            SparseArray<RegionObject> sparseArray3 = regionComposition.regionObjects;
            int i15 = 0;
            while (i15 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i15);
                RegionObject valueAt2 = sparseArray3.valueAt(i15);
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
                    i11 = i15;
                    sparseArray = sparseArray3;
                    paintPixelDataSubBlocks(objectData, clutDefinition, regionComposition.depth, valueAt2.horizontalPosition + i13, i14 + valueAt2.verticalPosition, paint, this.canvas);
                } else {
                    i11 = i15;
                    sparseArray = sparseArray3;
                }
                i15 = i11 + 1;
                sparseArray3 = sparseArray;
            }
            if (regionComposition.fillFlag) {
                int i16 = regionComposition.depth;
                if (i16 == 3) {
                    i10 = clutDefinition.clutEntries8Bit[regionComposition.pixelCode8Bit];
                } else if (i16 == 2) {
                    i10 = clutDefinition.clutEntries4Bit[regionComposition.pixelCode4Bit];
                } else {
                    i10 = clutDefinition.clutEntries2Bit[regionComposition.pixelCode2Bit];
                }
                this.fillRegionPaint.setColor(i10);
                this.canvas.drawRect(f9, f10, regionComposition.width + i13, regionComposition.height + i14, this.fillRegionPaint);
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(this.bitmap, i13, i14, regionComposition.width, regionComposition.height);
            int i17 = displayDefinition.width;
            int i18 = displayDefinition.height;
            arrayList.add(new Cue(createBitmap2, f9 / i17, 0, f10 / i18, 0, regionComposition.width / i17, regionComposition.height / i18));
            this.canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        return arrayList;
    }

    public final void reset() {
        this.subtitleService.reset();
    }
}
