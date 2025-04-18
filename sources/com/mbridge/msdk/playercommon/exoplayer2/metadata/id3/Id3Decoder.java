package com.mbridge.msdk.playercommon.exoplayer2.metadata.id3;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import eb.j;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.UByte;

/* loaded from: classes4.dex */
public final class Id3Decoder implements MetadataDecoder {
    private static final int FRAME_FLAG_V3_HAS_GROUP_IDENTIFIER = 32;
    private static final int FRAME_FLAG_V3_IS_COMPRESSED = 128;
    private static final int FRAME_FLAG_V3_IS_ENCRYPTED = 64;
    private static final int FRAME_FLAG_V4_HAS_DATA_LENGTH = 1;
    private static final int FRAME_FLAG_V4_HAS_GROUP_IDENTIFIER = 64;
    private static final int FRAME_FLAG_V4_IS_COMPRESSED = 8;
    private static final int FRAME_FLAG_V4_IS_ENCRYPTED = 4;
    private static final int FRAME_FLAG_V4_IS_UNSYNCHRONIZED = 2;
    public static final int ID3_HEADER_LENGTH = 10;
    private static final int ID3_TEXT_ENCODING_ISO_8859_1 = 0;
    private static final int ID3_TEXT_ENCODING_UTF_16 = 1;
    private static final int ID3_TEXT_ENCODING_UTF_16BE = 2;
    private static final int ID3_TEXT_ENCODING_UTF_8 = 3;
    private static final String TAG = "Id3Decoder";
    private final FramePredicate framePredicate;
    public static final FramePredicate NO_FRAMES_PREDICATE = new FramePredicate() { // from class: com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Decoder.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Decoder.FramePredicate
        public boolean evaluate(int i10, int i11, int i12, int i13, int i14) {
            return false;
        }
    };
    public static final int ID3_TAG = Util.getIntegerCodeForString("ID3");

    /* loaded from: classes4.dex */
    public interface FramePredicate {
        boolean evaluate(int i10, int i11, int i12, int i13, int i14);
    }

    /* loaded from: classes4.dex */
    public static final class Id3Header {
        private final int framesSize;
        private final boolean isUnsynchronized;
        private final int majorVersion;

        public Id3Header(int i10, boolean z10, int i11) {
            this.majorVersion = i10;
            this.isUnsynchronized = z10;
            this.framesSize = i11;
        }
    }

    public Id3Decoder() {
        this(null);
    }

    private static byte[] copyOfRangeIfValid(byte[] bArr, int i10, int i11) {
        if (i11 <= i10) {
            return new byte[0];
        }
        return Arrays.copyOfRange(bArr, i10, i11);
    }

    private static ApicFrame decodeApicFrame(ParsableByteArray parsableByteArray, int i10, int i11) throws UnsupportedEncodingException {
        int indexOfZeroByte;
        String str;
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(readUnsignedByte);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        parsableByteArray.readBytes(bArr, 0, i12);
        if (i11 == 2) {
            str = "image/" + Util.toLowerInvariant(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            indexOfZeroByte = 2;
        } else {
            indexOfZeroByte = indexOfZeroByte(bArr, 0);
            String lowerInvariant = Util.toLowerInvariant(new String(bArr, 0, indexOfZeroByte, "ISO-8859-1"));
            if (lowerInvariant.indexOf(47) == -1) {
                str = "image/".concat(lowerInvariant);
            } else {
                str = lowerInvariant;
            }
        }
        int i13 = bArr[indexOfZeroByte + 1] & UByte.MAX_VALUE;
        int i14 = indexOfZeroByte + 2;
        int indexOfEos = indexOfEos(bArr, i14, readUnsignedByte);
        return new ApicFrame(str, new String(bArr, i14, indexOfEos - i14, charsetName), i13, copyOfRangeIfValid(bArr, indexOfEos + delimiterLength(readUnsignedByte), i12));
    }

    private static BinaryFrame decodeBinaryFrame(ParsableByteArray parsableByteArray, int i10, String str) {
        byte[] bArr = new byte[i10];
        parsableByteArray.readBytes(bArr, 0, i10);
        return new BinaryFrame(str, bArr);
    }

    private static ChapterFrame decodeChapterFrame(ParsableByteArray parsableByteArray, int i10, int i11, boolean z10, int i12, FramePredicate framePredicate) throws UnsupportedEncodingException {
        long j3;
        long j10;
        int position = parsableByteArray.getPosition();
        int indexOfZeroByte = indexOfZeroByte(parsableByteArray.data, position);
        String str = new String(parsableByteArray.data, position, indexOfZeroByte - position, "ISO-8859-1");
        parsableByteArray.setPosition(indexOfZeroByte + 1);
        int readInt = parsableByteArray.readInt();
        int readInt2 = parsableByteArray.readInt();
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        if (readUnsignedInt == 4294967295L) {
            j3 = -1;
        } else {
            j3 = readUnsignedInt;
        }
        long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
        if (readUnsignedInt2 == 4294967295L) {
            j10 = -1;
        } else {
            j10 = readUnsignedInt2;
        }
        ArrayList arrayList = new ArrayList();
        int i13 = position + i10;
        while (parsableByteArray.getPosition() < i13) {
            Id3Frame decodeFrame = decodeFrame(i11, parsableByteArray, z10, i12, framePredicate);
            if (decodeFrame != null) {
                arrayList.add(decodeFrame);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterFrame(str, readInt, readInt2, j3, j10, id3FrameArr);
    }

    private static ChapterTocFrame decodeChapterTOCFrame(ParsableByteArray parsableByteArray, int i10, int i11, boolean z10, int i12, FramePredicate framePredicate) throws UnsupportedEncodingException {
        boolean z11;
        boolean z12;
        int position = parsableByteArray.getPosition();
        int indexOfZeroByte = indexOfZeroByte(parsableByteArray.data, position);
        String str = new String(parsableByteArray.data, position, indexOfZeroByte - position, "ISO-8859-1");
        parsableByteArray.setPosition(indexOfZeroByte + 1);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if ((readUnsignedByte & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((readUnsignedByte & 1) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
        String[] strArr = new String[readUnsignedByte2];
        for (int i13 = 0; i13 < readUnsignedByte2; i13++) {
            int position2 = parsableByteArray.getPosition();
            int indexOfZeroByte2 = indexOfZeroByte(parsableByteArray.data, position2);
            strArr[i13] = new String(parsableByteArray.data, position2, indexOfZeroByte2 - position2, "ISO-8859-1");
            parsableByteArray.setPosition(indexOfZeroByte2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = position + i10;
        while (parsableByteArray.getPosition() < i14) {
            Id3Frame decodeFrame = decodeFrame(i11, parsableByteArray, z10, i12, framePredicate);
            if (decodeFrame != null) {
                arrayList.add(decodeFrame);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z11, z12, strArr, id3FrameArr);
    }

    private static CommentFrame decodeCommentFrame(ParsableByteArray parsableByteArray, int i10) throws UnsupportedEncodingException {
        if (i10 < 4) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(readUnsignedByte);
        byte[] bArr = new byte[3];
        parsableByteArray.readBytes(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        parsableByteArray.readBytes(bArr2, 0, i11);
        int indexOfEos = indexOfEos(bArr2, 0, readUnsignedByte);
        String str2 = new String(bArr2, 0, indexOfEos, charsetName);
        int delimiterLength = indexOfEos + delimiterLength(readUnsignedByte);
        return new CommentFrame(str, str2, decodeStringIfValid(bArr2, delimiterLength, indexOfEos(bArr2, delimiterLength, readUnsignedByte), charsetName));
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0198, code lost:
    
        if (r14 == 67) goto L133;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Frame decodeFrame(int r20, com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray r21, boolean r22, int r23, com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Decoder.FramePredicate r24) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Decoder.decodeFrame(int, com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray, boolean, int, com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Decoder$FramePredicate):com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Frame");
    }

    private static GeobFrame decodeGeobFrame(ParsableByteArray parsableByteArray, int i10) throws UnsupportedEncodingException {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(readUnsignedByte);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        parsableByteArray.readBytes(bArr, 0, i11);
        int indexOfZeroByte = indexOfZeroByte(bArr, 0);
        String str = new String(bArr, 0, indexOfZeroByte, "ISO-8859-1");
        int i12 = indexOfZeroByte + 1;
        int indexOfEos = indexOfEos(bArr, i12, readUnsignedByte);
        String decodeStringIfValid = decodeStringIfValid(bArr, i12, indexOfEos, charsetName);
        int delimiterLength = indexOfEos + delimiterLength(readUnsignedByte);
        int indexOfEos2 = indexOfEos(bArr, delimiterLength, readUnsignedByte);
        return new GeobFrame(str, decodeStringIfValid, decodeStringIfValid(bArr, delimiterLength, indexOfEos2, charsetName), copyOfRangeIfValid(bArr, indexOfEos2 + delimiterLength(readUnsignedByte), i11));
    }

    private static Id3Header decodeHeader(ParsableByteArray parsableByteArray) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (parsableByteArray.bytesLeft() < 10) {
            Log.w(TAG, "Data too short to be an ID3 tag");
            return null;
        }
        int readUnsignedInt24 = parsableByteArray.readUnsignedInt24();
        if (readUnsignedInt24 != ID3_TAG) {
            j.v("Unexpected first three bytes of ID3 tag header: ", readUnsignedInt24, TAG);
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        boolean z14 = true;
        parsableByteArray.skipBytes(1);
        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
        int readSynchSafeInt = parsableByteArray.readSynchSafeInt();
        if (readUnsignedByte == 2) {
            if ((readUnsignedByte2 & 64) != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                Log.w(TAG, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (readUnsignedByte == 3) {
            if ((readUnsignedByte2 & 64) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                int readInt = parsableByteArray.readInt();
                parsableByteArray.skipBytes(readInt);
                readSynchSafeInt -= readInt + 4;
            }
        } else if (readUnsignedByte == 4) {
            if ((readUnsignedByte2 & 64) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int readSynchSafeInt2 = parsableByteArray.readSynchSafeInt();
                parsableByteArray.skipBytes(readSynchSafeInt2 - 4);
                readSynchSafeInt -= readSynchSafeInt2;
            }
            if ((readUnsignedByte2 & 16) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                readSynchSafeInt -= 10;
            }
        } else {
            j.v("Skipped ID3 tag with unsupported majorVersion=", readUnsignedByte, TAG);
            return null;
        }
        if (readUnsignedByte >= 4 || (readUnsignedByte2 & 128) == 0) {
            z14 = false;
        }
        return new Id3Header(readUnsignedByte, z14, readSynchSafeInt);
    }

    private static PrivFrame decodePrivFrame(ParsableByteArray parsableByteArray, int i10) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        parsableByteArray.readBytes(bArr, 0, i10);
        int indexOfZeroByte = indexOfZeroByte(bArr, 0);
        return new PrivFrame(new String(bArr, 0, indexOfZeroByte, "ISO-8859-1"), copyOfRangeIfValid(bArr, indexOfZeroByte + 1, i10));
    }

    private static String decodeStringIfValid(byte[] bArr, int i10, int i11, String str) throws UnsupportedEncodingException {
        if (i11 > i10 && i11 <= bArr.length) {
            return new String(bArr, i10, i11 - i10, str);
        }
        return "";
    }

    private static TextInformationFrame decodeTextInformationFrame(ParsableByteArray parsableByteArray, int i10, String str) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(readUnsignedByte);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        parsableByteArray.readBytes(bArr, 0, i11);
        return new TextInformationFrame(str, null, new String(bArr, 0, indexOfEos(bArr, 0, readUnsignedByte), charsetName));
    }

    private static TextInformationFrame decodeTxxxFrame(ParsableByteArray parsableByteArray, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(readUnsignedByte);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        parsableByteArray.readBytes(bArr, 0, i11);
        int indexOfEos = indexOfEos(bArr, 0, readUnsignedByte);
        String str = new String(bArr, 0, indexOfEos, charsetName);
        int delimiterLength = indexOfEos + delimiterLength(readUnsignedByte);
        return new TextInformationFrame("TXXX", str, decodeStringIfValid(bArr, delimiterLength, indexOfEos(bArr, delimiterLength, readUnsignedByte), charsetName));
    }

    private static UrlLinkFrame decodeUrlLinkFrame(ParsableByteArray parsableByteArray, int i10, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        parsableByteArray.readBytes(bArr, 0, i10);
        return new UrlLinkFrame(str, null, new String(bArr, 0, indexOfZeroByte(bArr, 0), "ISO-8859-1"));
    }

    private static UrlLinkFrame decodeWxxxFrame(ParsableByteArray parsableByteArray, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(readUnsignedByte);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        parsableByteArray.readBytes(bArr, 0, i11);
        int indexOfEos = indexOfEos(bArr, 0, readUnsignedByte);
        String str = new String(bArr, 0, indexOfEos, charsetName);
        int delimiterLength = indexOfEos + delimiterLength(readUnsignedByte);
        return new UrlLinkFrame("WXXX", str, decodeStringIfValid(bArr, delimiterLength, indexOfZeroByte(bArr, delimiterLength), "ISO-8859-1"));
    }

    private static int delimiterLength(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static String getCharsetName(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : C.UTF16_NAME;
    }

    private static String getFrameId(int i10, int i11, int i12, int i13, int i14) {
        if (i10 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    private static int indexOfEos(byte[] bArr, int i10, int i11) {
        int indexOfZeroByte = indexOfZeroByte(bArr, i10);
        if (i11 != 0 && i11 != 3) {
            while (indexOfZeroByte < bArr.length - 1) {
                if (indexOfZeroByte % 2 == 0 && bArr[indexOfZeroByte + 1] == 0) {
                    return indexOfZeroByte;
                }
                indexOfZeroByte = indexOfZeroByte(bArr, indexOfZeroByte + 1);
            }
            return bArr.length;
        }
        return indexOfZeroByte;
    }

    private static int indexOfZeroByte(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    private static int removeUnsynchronization(ParsableByteArray parsableByteArray, int i10) {
        byte[] bArr = parsableByteArray.data;
        int position = parsableByteArray.getPosition();
        while (true) {
            int i11 = position + 1;
            if (i11 < i10) {
                if ((bArr[position] & UByte.MAX_VALUE) == 255 && bArr[i11] == 0) {
                    System.arraycopy(bArr, position + 2, bArr, i11, (i10 - position) - 2);
                    i10--;
                }
                position = i11;
            } else {
                return i10;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if ((r10 & 1) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0086, code lost:
    
        if ((r10 & 128) != 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean validateFrames(com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.getPosition()
        L8:
            int r3 = r18.bytesLeft()     // Catch: java.lang.Throwable -> Laf
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r18.readInt()     // Catch: java.lang.Throwable -> Laf
            long r8 = r18.readUnsignedInt()     // Catch: java.lang.Throwable -> Laf
            int r10 = r18.readUnsignedShort()     // Catch: java.lang.Throwable -> Laf
            goto L2c
        L22:
            int r7 = r18.readUnsignedInt24()     // Catch: java.lang.Throwable -> Laf
            int r8 = r18.readUnsignedInt24()     // Catch: java.lang.Throwable -> Laf
            long r8 = (long) r8
            r10 = r6
        L2c:
            r11 = 0
            if (r7 != 0) goto L3a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3a
            if (r10 != 0) goto L3a
            r1.setPosition(r2)
            return r4
        L3a:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r21 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4b
            r1.setPosition(r2)
            return r6
        L4b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6b:
            if (r0 != r7) goto L7b
            r3 = r10 & 64
            if (r3 == 0) goto L73
            r3 = r4
            goto L74
        L73:
            r3 = r6
        L74:
            r7 = r10 & 1
            if (r7 == 0) goto L79
            goto L8b
        L79:
            r4 = r6
            goto L8b
        L7b:
            if (r0 != r3) goto L89
            r3 = r10 & 32
            if (r3 == 0) goto L83
            r3 = r4
            goto L84
        L83:
            r3 = r6
        L84:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L79
            goto L8b
        L89:
            r3 = r6
            r4 = r3
        L8b:
            if (r4 == 0) goto L8f
            int r3 = r3 + 4
        L8f:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L98
            r1.setPosition(r2)
            return r6
        L98:
            int r3 = r18.bytesLeft()     // Catch: java.lang.Throwable -> Laf
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La5
            r1.setPosition(r2)
            return r6
        La5:
            int r3 = (int) r8
            r1.skipBytes(r3)     // Catch: java.lang.Throwable -> Laf
            goto L8
        Lab:
            r1.setPosition(r2)
            return r4
        Laf:
            r0 = move-exception
            r1.setPosition(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Decoder.validateFrames(com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray, int, int, boolean):boolean");
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataDecoder
    public final Metadata decode(MetadataInputBuffer metadataInputBuffer) {
        ByteBuffer byteBuffer = metadataInputBuffer.data;
        return decode(byteBuffer.array(), byteBuffer.limit());
    }

    public Id3Decoder(FramePredicate framePredicate) {
        this.framePredicate = framePredicate;
    }

    public final Metadata decode(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i10);
        Id3Header decodeHeader = decodeHeader(parsableByteArray);
        if (decodeHeader == null) {
            return null;
        }
        int position = parsableByteArray.getPosition();
        int i11 = decodeHeader.majorVersion == 2 ? 6 : 10;
        int i12 = decodeHeader.framesSize;
        if (decodeHeader.isUnsynchronized) {
            i12 = removeUnsynchronization(parsableByteArray, decodeHeader.framesSize);
        }
        parsableByteArray.setLimit(position + i12);
        boolean z10 = false;
        if (!validateFrames(parsableByteArray, decodeHeader.majorVersion, i11, false)) {
            if (decodeHeader.majorVersion != 4 || !validateFrames(parsableByteArray, 4, i11, true)) {
                Log.w(TAG, "Failed to validate ID3 tag with majorVersion=" + decodeHeader.majorVersion);
                return null;
            }
            z10 = true;
        }
        while (parsableByteArray.bytesLeft() >= i11) {
            Id3Frame decodeFrame = decodeFrame(decodeHeader.majorVersion, parsableByteArray, z10, i11, this.framePredicate);
            if (decodeFrame != null) {
                arrayList.add(decodeFrame);
            }
        }
        return new Metadata(arrayList);
    }
}
