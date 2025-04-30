package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;

/* loaded from: classes3.dex */
final class Sniffer {
    private static final int[] COMPATIBLE_BRANDS = {Util.getIntegerCodeForString("isom"), Util.getIntegerCodeForString("iso2"), Util.getIntegerCodeForString("iso3"), Util.getIntegerCodeForString("iso4"), Util.getIntegerCodeForString("iso5"), Util.getIntegerCodeForString("iso6"), Util.getIntegerCodeForString("avc1"), Util.getIntegerCodeForString("hvc1"), Util.getIntegerCodeForString("hev1"), Util.getIntegerCodeForString("mp41"), Util.getIntegerCodeForString("mp42"), Util.getIntegerCodeForString("3g2a"), Util.getIntegerCodeForString("3g2b"), Util.getIntegerCodeForString("3gr6"), Util.getIntegerCodeForString("3gs6"), Util.getIntegerCodeForString("3ge6"), Util.getIntegerCodeForString("3gg6"), Util.getIntegerCodeForString("M4V "), Util.getIntegerCodeForString("M4A "), Util.getIntegerCodeForString("f4v "), Util.getIntegerCodeForString("kddi"), Util.getIntegerCodeForString("M4VP"), Util.getIntegerCodeForString("qt  "), Util.getIntegerCodeForString("MSNV")};
    private static final int SEARCH_LENGTH = 4096;

    private Sniffer() {
    }

    private static boolean isCompatibleBrand(int i9) {
        if ((i9 >>> 8) == Util.getIntegerCodeForString("3gp")) {
            return true;
        }
        for (int i10 : COMPATIBLE_BRANDS) {
            if (i10 == i9) {
                return true;
            }
        }
        return false;
    }

    public static boolean sniffFragmented(ExtractorInput extractorInput) throws IOException, InterruptedException {
        return sniffInternal(extractorInput, true);
    }

    private static boolean sniffInternal(ExtractorInput extractorInput, boolean z8) throws IOException, InterruptedException {
        boolean z9;
        boolean z10;
        int i9;
        long length = extractorInput.getLength();
        long j7 = -1;
        if (length == -1 || length > 4096) {
            length = 4096;
        }
        int i10 = (int) length;
        ParsableByteArray parsableByteArray = new ParsableByteArray(64);
        int i11 = 0;
        boolean z11 = false;
        while (i11 < i10) {
            parsableByteArray.reset(8);
            extractorInput.peekFully(parsableByteArray.data, 0, 8);
            long readUnsignedInt = parsableByteArray.readUnsignedInt();
            int readInt = parsableByteArray.readInt();
            if (readUnsignedInt == 1) {
                extractorInput.peekFully(parsableByteArray.data, 8, 8);
                parsableByteArray.setLimit(16);
                i9 = 16;
                readUnsignedInt = parsableByteArray.readUnsignedLongToLong();
            } else {
                if (readUnsignedInt == 0) {
                    long length2 = extractorInput.getLength();
                    if (length2 != j7) {
                        readUnsignedInt = 8 + (length2 - extractorInput.getPosition());
                    }
                }
                i9 = 8;
            }
            long j9 = i9;
            if (readUnsignedInt < j9) {
                return false;
            }
            i11 += i9;
            if (readInt != Atom.TYPE_moov) {
                if (readInt == Atom.TYPE_moof || readInt == Atom.TYPE_mvex) {
                    z9 = true;
                    z10 = true;
                    break;
                }
                if ((i11 + readUnsignedInt) - j9 >= i10) {
                    break;
                }
                int i12 = (int) (readUnsignedInt - j9);
                i11 += i12;
                if (readInt == Atom.TYPE_ftyp) {
                    if (i12 < 8) {
                        return false;
                    }
                    parsableByteArray.reset(i12);
                    extractorInput.peekFully(parsableByteArray.data, 0, i12);
                    int i13 = i12 / 4;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= i13) {
                            break;
                        }
                        if (i14 == 1) {
                            parsableByteArray.skipBytes(4);
                        } else if (isCompatibleBrand(parsableByteArray.readInt())) {
                            z11 = true;
                            break;
                        }
                        i14++;
                    }
                    if (!z11) {
                        return false;
                    }
                } else if (i12 != 0) {
                    extractorInput.advancePeekPosition(i12);
                }
                j7 = -1;
            }
        }
        z9 = true;
        z10 = false;
        if (!z11 || z8 != z10) {
            return false;
        }
        return z9;
    }

    public static boolean sniffUnfragmented(ExtractorInput extractorInput) throws IOException, InterruptedException {
        return sniffInternal(extractorInput, false);
    }
}
