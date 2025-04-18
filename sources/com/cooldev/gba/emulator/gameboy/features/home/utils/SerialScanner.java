package com.cooldev.gba.emulator.gameboy.features.home.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import b1.f0;
import com.cooldev.gba.emulator.gameboy.features.home.models.MagicNumber;
import com.cooldev.gba.emulator.gameboy.features.home.models.SystemID;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import e0.g0;
import e0.p;
import e0.q;
import e0.u;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.signature.SignatureVisitor;
import p0.a;
import y0.j;
import y0.m;
import y0.n;
import y0.o;
import z0.f;
import z0.h;

@StabilityInferred
/* loaded from: classes.dex */
public final class SerialScanner {
    public static final int $stable;

    @NotNull
    private static final List<MagicNumber> MAGIC_NUMBERS;

    @NotNull
    private static final List<String> PSP_BASE_SERIALS;

    @NotNull
    private static final List<String> PSX_BASE_SERIALS;
    private static final int PS_SERIAL_MAX_SIZE = 12;

    @NotNull
    private static final h PS_SERIAL_REGEX;

    @NotNull
    private static final h PS_SERIAL_REGEX2;

    @NotNull
    private static final h SEGA_CD_REGEX;

    @NotNull
    public static final SerialScanner INSTANCE = new SerialScanner();
    private static final int READ_BUFFER_SIZE = UtilsKt.kiloBytes(64);

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class DiskInfo {
        public static final int $stable = 0;

        @Nullable
        private final String serial;

        @Nullable
        private final SystemID systemID;

        public DiskInfo(@Nullable String str, @Nullable SystemID systemID) {
            this.serial = str;
            this.systemID = systemID;
        }

        public static /* synthetic */ DiskInfo copy$default(DiskInfo diskInfo, String str, SystemID systemID, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = diskInfo.serial;
            }
            if ((i2 & 2) != 0) {
                systemID = diskInfo.systemID;
            }
            return diskInfo.copy(str, systemID);
        }

        @Nullable
        public final String component1() {
            return this.serial;
        }

        @Nullable
        public final SystemID component2() {
            return this.systemID;
        }

        @NotNull
        public final DiskInfo copy(@Nullable String str, @Nullable SystemID systemID) {
            return new DiskInfo(str, systemID);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DiskInfo)) {
                return false;
            }
            DiskInfo diskInfo = (DiskInfo) obj;
            return a.g(this.serial, diskInfo.serial) && this.systemID == diskInfo.systemID;
        }

        @Nullable
        public final String getSerial() {
            return this.serial;
        }

        @Nullable
        public final SystemID getSystemID() {
            return this.systemID;
        }

        public int hashCode() {
            String str = this.serial;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            SystemID systemID = this.systemID;
            return hashCode + (systemID != null ? systemID.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "DiskInfo(serial=" + this.serial + ", systemID=" + this.systemID + ')';
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SystemID.values().length];
            try {
                iArr[SystemID.SEGACD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SystemID.PSX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SystemID.PSP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        byte[] copyOf = Arrays.copyOf(new byte[]{83, 69, 71, 65, 68, 73, 83, 67, 83, 89, 83, 84, 69, 77}, 14);
        a.r(copyOf, "copyOf(...)");
        MagicNumber magicNumber = new MagicNumber(16, copyOf, SystemID.SEGACD);
        byte[] copyOf2 = Arrays.copyOf(new byte[]{80, 76, 65, 89, 83, 84, 65, 84, 73, 79, 78}, 11);
        a.r(copyOf2, "copyOf(...)");
        SystemID systemID = SystemID.PSX;
        MagicNumber magicNumber2 = new MagicNumber(32776, copyOf2, systemID);
        byte[] copyOf3 = Arrays.copyOf(new byte[]{80, 76, 65, 89, 83, 84, 65, 84, 73, 79, 78}, 11);
        a.r(copyOf3, "copyOf(...)");
        MagicNumber magicNumber3 = new MagicNumber(37664, copyOf3, systemID);
        byte[] copyOf4 = Arrays.copyOf(new byte[]{80, 83, 80, 32, 71, 65, 77, 69}, 8);
        a.r(copyOf4, "copyOf(...)");
        MAGIC_NUMBERS = f0.v(magicNumber, magicNumber2, magicNumber3, new MagicNumber(32776, copyOf4, SystemID.PSP));
        SEGA_CD_REGEX = new h("([A-Z]+)?-?([0-9]+) ?-?([0-9]*)");
        PS_SERIAL_REGEX = new h("^([A-Z]+)-?([0-9]+)");
        PS_SERIAL_REGEX2 = new h("^([A-Z]+)_?([0-9]{3})\\.([0-9]{2})");
        PSX_BASE_SERIALS = f0.v("CPCS", "SCES", "SIPS", "SLKA", "SLPS", "SLUS", "ESPM", "SLED", "SCPS", "SCAJ", "PAPX", "SLES", "HPS", "LSP", "SLPM", "SCUS", "SCED");
        PSP_BASE_SERIALS = f0.v("ULES", "ULUS", "ULJS", "ULEM", "ULUM", "ULJM", "ULKS", "ULAS", "UCES", "UCUS", "UCJS", "UCAS", "NPEH", "NPUH", "NPJH", "NPEG", "NPEX", "NPUG", "NPJG", "NPJJ", "NPHG", "NPEZ", "NPUZ", "NPJZ", "NPUF", "NPUZ", "NPUG", "NPUX");
        $stable = 8;
    }

    private SerialScanner() {
    }

    private final DiskInfo extractInfoFor3DS(InputStream inputStream) {
        inputStream.mark(8192);
        inputStream.skip(4432L);
        String str = new String(readByteArray(inputStream, new byte[10]), z0.a.f31459b);
        inputStream.reset();
        return new DiskInfo(str, SystemID.NINTENDO_3DS);
    }

    private final DiskInfo extractInfoForPBP(InputStream inputStream) {
        int megaBytes = UtilsKt.megaBytes(2);
        if (inputStream.available() < megaBytes) {
            return new DiskInfo(null, null);
        }
        DiskInfo diskInfo = (DiskInfo) m.M(m.P(m.Q(textSearch$default(this, u.P0(PSX_BASE_SERIALS, PSP_BASE_SERIALS), inputStream, 12, megaBytes, 0, 0, null, 112, null), SerialScanner$extractInfoForPBP$1.INSTANCE), SerialScanner$extractInfoForPBP$2.INSTANCE));
        return diskInfo == null ? new DiskInfo(null, null) : diskInfo;
    }

    private final DiskInfo extractInfoForPSP(InputStream inputStream) {
        int kiloBytes = UtilsKt.kiloBytes(64);
        if (inputStream.available() < kiloBytes) {
            return new DiskInfo(null, null);
        }
        DiskInfo diskInfo = (DiskInfo) m.M(m.P(m.Q(textSearch$default(this, PSP_BASE_SERIALS, inputStream, 12, kiloBytes, 0, 0, null, 112, null), SerialScanner$extractInfoForPSP$1.INSTANCE), SerialScanner$extractInfoForPSP$2.INSTANCE));
        return diskInfo == null ? new DiskInfo(null, SystemID.PSP) : diskInfo;
    }

    private final DiskInfo extractInfoForPSX(InputStream inputStream) {
        int kiloBytes = UtilsKt.kiloBytes(64);
        if (inputStream.available() < kiloBytes) {
            return new DiskInfo(null, null);
        }
        DiskInfo diskInfo = (DiskInfo) m.M(m.P(m.Q(textSearch$default(this, PSX_BASE_SERIALS, inputStream, 12, kiloBytes, 0, 0, null, 112, null), SerialScanner$extractInfoForPSX$1.INSTANCE), SerialScanner$extractInfoForPSX$2.INSTANCE));
        return diskInfo == null ? new DiskInfo(null, SystemID.PSX) : diskInfo;
    }

    private final DiskInfo extractInfoForSegaCD(InputStream inputStream) {
        inputStream.mark(BrandSafetyUtils.f29185h);
        inputStream.skip(403L);
        byte[] readByteArray = readByteArray(inputStream, new byte[16]);
        Charset charset = z0.a.f31459b;
        String str = new String(readByteArray, charset);
        inputStream.reset();
        inputStream.skip(512L);
        String str2 = new String(readByteArray(inputStream, new byte[1]), charset);
        f a2 = h.a(SEGA_CD_REGEX, str);
        List a3 = a2 != null ? a2.a() : null;
        String str3 = a3 != null ? (String) ((g0) a3).get(1) : null;
        String str4 = a3 != null ? (String) ((g0) a3).get(2) : null;
        String str5 = a3 != null ? (String) ((g0) a3).get(3) : null;
        if (a.g(str2, "E")) {
            str5 = "50";
        }
        return new DiskInfo(m.O(m.L(new y0.f(n.K(str3, str4, a.g(str5, "00") ? null : str5), false, o.f31446a), SerialScanner$extractInfoForSegaCD$finalSerial$1.INSTANCE), "-", SerialScanner$extractInfoForSegaCD$finalSerial$2.INSTANCE, 30), SystemID.SEGACD);
    }

    private static /* synthetic */ void getMAGIC_NUMBERS$annotations() {
    }

    private final j movingWindowSequence(InputStream inputStream, int i2, long j2) {
        return new p(new SerialScanner$movingWindowSequence$1(i2, inputStream, j2, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String parsePSXSerial(String str) {
        String str2;
        String[] strArr = new String[2];
        f a2 = h.a(PS_SERIAL_REGEX, str);
        String str3 = null;
        if (a2 != null) {
            List a3 = a2.a();
            StringBuilder sb = new StringBuilder();
            g0 g0Var = (g0) a3;
            sb.append((String) g0Var.get(1));
            sb.append(SignatureVisitor.SUPER);
            sb.append((String) g0Var.get(2));
            str2 = sb.toString();
        } else {
            str2 = null;
        }
        strArr[0] = str2;
        f a4 = h.a(PS_SERIAL_REGEX2, str);
        if (a4 != null) {
            List a5 = a4.a();
            StringBuilder sb2 = new StringBuilder();
            g0 g0Var2 = (g0) a5;
            sb2.append((String) g0Var2.get(1));
            sb2.append(SignatureVisitor.SUPER);
            sb2.append((String) g0Var2.get(2));
            sb2.append((String) g0Var2.get(3));
            str3 = sb2.toString();
        }
        strArr[1] = str3;
        return (String) m.M(m.L(n.K(strArr), SerialScanner$parsePSXSerial$3.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] readByteArray(InputStream inputStream, byte[] bArr) {
        int read = inputStream.read(bArr);
        if (read >= bArr.length) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, read);
        a.r(copyOf, "copyOf(...)");
        return copyOf;
    }

    private final DiskInfo standardExtractInfo(InputStream inputStream) {
        Object obj;
        Object d;
        Object d2;
        Object d3;
        int i2 = READ_BUFFER_SIZE;
        inputStream.mark(i2);
        byte[] readByteArray = readByteArray(inputStream, new byte[i2]);
        Iterator<T> it = MAGIC_NUMBERS.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            MagicNumber magicNumber = (MagicNumber) obj;
            if (Arrays.equals(q.U(magicNumber.getOffset(), readByteArray, magicNumber.getOffset() + magicNumber.getNumbers().length), magicNumber.getNumbers())) {
                break;
            }
        }
        MagicNumber magicNumber2 = (MagicNumber) obj;
        SystemID systemID = magicNumber2 != null ? magicNumber2.getSystemID() : null;
        inputStream.reset();
        int i3 = systemID == null ? -1 : WhenMappings.$EnumSwitchMapping$0[systemID.ordinal()];
        if (i3 == 1) {
            try {
                d = extractInfoForSegaCD(inputStream);
            } catch (Throwable th) {
                d = kotlin.jvm.internal.q.d(th);
            }
            Object diskInfo = new DiskInfo(null, SystemID.SEGACD);
            if (d instanceof d0.m) {
                d = diskInfo;
            }
            return (DiskInfo) d;
        }
        if (i3 == 2) {
            try {
                d2 = extractInfoForPSX(inputStream);
            } catch (Throwable th2) {
                d2 = kotlin.jvm.internal.q.d(th2);
            }
            Object diskInfo2 = new DiskInfo(null, SystemID.PSX);
            if (d2 instanceof d0.m) {
                d2 = diskInfo2;
            }
            return (DiskInfo) d2;
        }
        if (i3 != 3) {
            return new DiskInfo(null, null);
        }
        try {
            d3 = extractInfoForPSP(inputStream);
        } catch (Throwable th3) {
            d3 = kotlin.jvm.internal.q.d(th3);
        }
        Object diskInfo3 = new DiskInfo(null, SystemID.PSP);
        if (d3 instanceof d0.m) {
            d3 = diskInfo3;
        }
        return (DiskInfo) d3;
    }

    private final j textSearch(List<String> list, InputStream inputStream, int i2, int i3, int i4, int i5, Charset charset) {
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(q.M(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes(charset);
            a.r(bytes, "getBytes(...)");
            arrayList.add(bytes);
        }
        return m.P(m.N(m.R(movingWindowSequence(inputStream, i4, i5), a.s0(Math.ceil(i3 / i5))), new SerialScanner$textSearch$1(arrayList)), new SerialScanner$textSearch$2(i2, charset));
    }

    public static /* synthetic */ j textSearch$default(SerialScanner serialScanner, List list, InputStream inputStream, int i2, int i3, int i4, int i5, Charset charset, int i6, Object obj) {
        int kiloBytes = (i6 & 16) != 0 ? UtilsKt.kiloBytes(8) : i4;
        return serialScanner.textSearch(list, inputStream, i2, i3, kiloBytes, (i6 & 32) != 0 ? kiloBytes - i2 : i5, (i6 & 64) != 0 ? z0.a.f31459b : charset);
    }

    @NotNull
    public final DiskInfo extractInfo(@NotNull String str, @NotNull InputStream inputStream) {
        DiskInfo extractInfoFor3DS;
        a.s(str, "fileName");
        a.s(inputStream, "inputStream");
        BufferedInputStream bufferedInputStream = inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, READ_BUFFER_SIZE);
        try {
            String extractExtension = FileUtils.INSTANCE.extractExtension(str);
            switch (extractExtension.hashCode()) {
                case 52226:
                    if (extractExtension.equals("3ds")) {
                        extractInfoFor3DS = INSTANCE.extractInfoFor3DS(bufferedInputStream);
                        break;
                    }
                    extractInfoFor3DS = new DiskInfo(null, null);
                    break;
                case 97543:
                    if (!extractExtension.equals("bin")) {
                        extractInfoFor3DS = new DiskInfo(null, null);
                        break;
                    }
                    extractInfoFor3DS = INSTANCE.standardExtractInfo(bufferedInputStream);
                    break;
                case 104581:
                    if (!extractExtension.equals("iso")) {
                        extractInfoFor3DS = new DiskInfo(null, null);
                        break;
                    }
                    extractInfoFor3DS = INSTANCE.standardExtractInfo(bufferedInputStream);
                    break;
                case 110782:
                    if (extractExtension.equals("pbp")) {
                        extractInfoFor3DS = INSTANCE.extractInfoForPBP(bufferedInputStream);
                        break;
                    }
                    extractInfoFor3DS = new DiskInfo(null, null);
                    break;
                default:
                    extractInfoFor3DS = new DiskInfo(null, null);
                    break;
            }
            kotlin.jvm.internal.q.b(bufferedInputStream, null);
            return extractInfoFor3DS;
        } finally {
        }
    }
}
