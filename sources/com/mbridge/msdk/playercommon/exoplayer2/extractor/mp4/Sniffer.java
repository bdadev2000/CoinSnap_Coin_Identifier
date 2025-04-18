package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;

/* loaded from: classes4.dex */
final class Sniffer {
    private static final int[] COMPATIBLE_BRANDS = {Util.getIntegerCodeForString("isom"), Util.getIntegerCodeForString("iso2"), Util.getIntegerCodeForString("iso3"), Util.getIntegerCodeForString("iso4"), Util.getIntegerCodeForString("iso5"), Util.getIntegerCodeForString("iso6"), Util.getIntegerCodeForString("avc1"), Util.getIntegerCodeForString("hvc1"), Util.getIntegerCodeForString("hev1"), Util.getIntegerCodeForString("mp41"), Util.getIntegerCodeForString("mp42"), Util.getIntegerCodeForString("3g2a"), Util.getIntegerCodeForString("3g2b"), Util.getIntegerCodeForString("3gr6"), Util.getIntegerCodeForString("3gs6"), Util.getIntegerCodeForString("3ge6"), Util.getIntegerCodeForString("3gg6"), Util.getIntegerCodeForString("M4V "), Util.getIntegerCodeForString("M4A "), Util.getIntegerCodeForString("f4v "), Util.getIntegerCodeForString("kddi"), Util.getIntegerCodeForString("M4VP"), Util.getIntegerCodeForString("qt  "), Util.getIntegerCodeForString("MSNV")};
    private static final int SEARCH_LENGTH = 4096;

    private Sniffer() {
    }

    private static boolean isCompatibleBrand(int i10) {
        if ((i10 >>> 8) == Util.getIntegerCodeForString("3gp")) {
            return true;
        }
        for (int i11 : COMPATIBLE_BRANDS) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean sniffFragmented(ExtractorInput extractorInput) throws IOException, InterruptedException {
        return sniffInternal(extractorInput, true);
    }

    private static boolean sniffInternal(ExtractorInput extractorInput, boolean z10) throws IOException, InterruptedException {
        boolean z11;
        boolean z12;
        int i10;
        long length = extractorInput.getLength();
        long j3 = -1;
        if (length == -1 || length > 4096) {
            length = 4096;
        }
        int i11 = (int) length;
        ParsableByteArray parsableByteArray = new ParsableByteArray(64);
        int i12 = 0;
        boolean z13 = false;
        while (i12 < i11) {
            parsableByteArray.reset(8);
            extractorInput.peekFully(parsableByteArray.data, 0, 8);
            long readUnsignedInt = parsableByteArray.readUnsignedInt();
            int readInt = parsableByteArray.readInt();
            if (readUnsignedInt == 1) {
                extractorInput.peekFully(parsableByteArray.data, 8, 8);
                parsableByteArray.setLimit(16);
                i10 = 16;
                readUnsignedInt = parsableByteArray.readUnsignedLongToLong();
            } else {
                if (readUnsignedInt == 0) {
                    long length2 = extractorInput.getLength();
                    if (length2 != j3) {
                        readUnsignedInt = 8 + (length2 - extractorInput.getPosition());
                    }
                }
                i10 = 8;
            }
            long j10 = i10;
            if (readUnsignedInt < j10) {
                return false;
            }
            i12 += i10;
            if (readInt != Atom.TYPE_moov) {
                if (readInt != Atom.TYPE_moof && readInt != Atom.TYPE_mvex) {
                    if ((i12 + readUnsignedInt) - j10 >= i11) {
                        break;
                    }
                    int i13 = (int) (readUnsignedInt - j10);
                    i12 += i13;
                    if (readInt == Atom.TYPE_ftyp) {
                        if (i13 < 8) {
                            return false;
                        }
                        parsableByteArray.reset(i13);
                        extractorInput.peekFully(parsableByteArray.data, 0, i13);
                        int i14 = i13 / 4;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= i14) {
                                break;
                            }
                            if (i15 == 1) {
                                parsableByteArray.skipBytes(4);
                            } else if (isCompatibleBrand(parsableByteArray.readInt())) {
                                z13 = true;
                                break;
                            }
                            i15++;
                        }
                        if (!z13) {
                            return false;
                        }
                    } else if (i13 != 0) {
                        extractorInput.advancePeekPosition(i13);
                    }
                    j3 = -1;
                } else {
                    z11 = true;
                    z12 = true;
                    break;
                }
            }
        }
        z11 = true;
        z12 = false;
        if (!z13 || z10 != z12) {
            return false;
        }
        return z11;
    }

    public static boolean sniffUnfragmented(ExtractorInput extractorInput) throws IOException, InterruptedException {
        return sniffInternal(extractorInput, false);
    }
}
