package com.google.common.net;

import com.applovin.impl.adview.t;
import com.facebook.internal.security.CertificateUtil;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.CharMatcher;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.hash.Hashing;
import com.google.common.io.ByteStreams;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public final class InetAddresses {
    private static final int IPV4_PART_COUNT = 4;
    private static final int IPV6_PART_COUNT = 8;
    private static final char IPV4_DELIMITER = '.';
    private static final CharMatcher IPV4_DELIMITER_MATCHER = CharMatcher.is(IPV4_DELIMITER);
    private static final char IPV6_DELIMITER = ':';
    private static final CharMatcher IPV6_DELIMITER_MATCHER = CharMatcher.is(IPV6_DELIMITER);
    private static final Inet4Address LOOPBACK4 = (Inet4Address) forString("127.0.0.1");
    private static final Inet4Address ANY4 = (Inet4Address) forString("0.0.0.0");

    /* loaded from: classes3.dex */
    public static final class TeredoInfo {
        private final Inet4Address client;
        private final int flags;
        private final int port;
        private final Inet4Address server;

        public TeredoInfo(Inet4Address inet4Address, Inet4Address inet4Address2, int i2, int i3) {
            Preconditions.checkArgument(i2 >= 0 && i2 <= 65535, "port '%s' is out of range (0 <= port <= 0xffff)", i2);
            Preconditions.checkArgument(i3 >= 0 && i3 <= 65535, "flags '%s' is out of range (0 <= flags <= 0xffff)", i3);
            this.server = (Inet4Address) MoreObjects.firstNonNull(inet4Address, InetAddresses.ANY4);
            this.client = (Inet4Address) MoreObjects.firstNonNull(inet4Address2, InetAddresses.ANY4);
            this.port = i2;
            this.flags = i3;
        }

        public Inet4Address getClient() {
            return this.client;
        }

        public int getFlags() {
            return this.flags;
        }

        public int getPort() {
            return this.port;
        }

        public Inet4Address getServer() {
            return this.server;
        }
    }

    private InetAddresses() {
    }

    private static InetAddress bytesToInetAddress(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e) {
            throw new AssertionError(e);
        }
    }

    public static int coerceToInteger(InetAddress inetAddress) {
        return ByteStreams.newDataInput(getCoercedIPv4Address(inetAddress).getAddress()).readInt();
    }

    private static void compressLongestRunOfZeroes(int[] iArr) {
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < iArr.length + 1; i5++) {
            if (i5 >= iArr.length || iArr[i5] != 0) {
                if (i4 >= 0) {
                    int i6 = i5 - i4;
                    if (i6 > i2) {
                        i3 = i4;
                        i2 = i6;
                    }
                    i4 = -1;
                }
            } else if (i4 < 0) {
                i4 = i5;
            }
        }
        if (i2 >= 2) {
            Arrays.fill(iArr, i3, i2 + i3, -1);
        }
    }

    private static String convertDottedQuadToHex(String str) {
        int lastIndexOf = str.lastIndexOf(58) + 1;
        String substring = str.substring(0, lastIndexOf);
        byte[] textToNumericFormatV4 = textToNumericFormatV4(str.substring(lastIndexOf));
        if (textToNumericFormatV4 == null) {
            return null;
        }
        String hexString = Integer.toHexString(((textToNumericFormatV4[0] & UnsignedBytes.MAX_VALUE) << 8) | (textToNumericFormatV4[1] & UnsignedBytes.MAX_VALUE));
        String hexString2 = Integer.toHexString((textToNumericFormatV4[3] & UnsignedBytes.MAX_VALUE) | ((textToNumericFormatV4[2] & UnsignedBytes.MAX_VALUE) << 8));
        return t.k(t.b(hexString2, t.b(hexString, t.b(substring, 1))), substring, hexString, CertificateUtil.DELIMITER, hexString2);
    }

    public static InetAddress decrement(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        int length = address.length - 1;
        while (length >= 0 && address[length] == 0) {
            address[length] = -1;
            length--;
        }
        Preconditions.checkArgument(length >= 0, "Decrementing %s would wrap.", inetAddress);
        address[length] = (byte) (address[length] - 1);
        return bytesToInetAddress(address);
    }

    @CanIgnoreReturnValue
    public static InetAddress forString(String str) {
        byte[] ipStringToBytes = ipStringToBytes(str);
        if (ipStringToBytes != null) {
            return bytesToInetAddress(ipStringToBytes);
        }
        throw formatIllegalArgumentException("'%s' is not an IP string literal.", str);
    }

    public static InetAddress forUriString(String str) {
        InetAddress forUriStringNoThrow = forUriStringNoThrow(str);
        if (forUriStringNoThrow != null) {
            return forUriStringNoThrow;
        }
        throw formatIllegalArgumentException("Not a valid URI IP literal: '%s'", str);
    }

    private static InetAddress forUriStringNoThrow(String str) {
        int i2;
        Preconditions.checkNotNull(str);
        if (str.startsWith("[") && str.endsWith("]")) {
            str = str.substring(1, str.length() - 1);
            i2 = 16;
        } else {
            i2 = 4;
        }
        byte[] ipStringToBytes = ipStringToBytes(str);
        if (ipStringToBytes == null || ipStringToBytes.length != i2) {
            return null;
        }
        return bytesToInetAddress(ipStringToBytes);
    }

    private static IllegalArgumentException formatIllegalArgumentException(String str, Object... objArr) {
        return new IllegalArgumentException(String.format(Locale.ROOT, str, objArr));
    }

    private static InetAddress fromBigInteger(BigInteger bigInteger, boolean z2) {
        Preconditions.checkArgument(bigInteger.signum() >= 0, "BigInteger must be greater than or equal to 0");
        int i2 = z2 ? 16 : 4;
        byte[] byteArray = bigInteger.toByteArray();
        byte[] bArr = new byte[i2];
        int max = Math.max(0, byteArray.length - i2);
        int length = byteArray.length - max;
        int i3 = i2 - length;
        for (int i4 = 0; i4 < max; i4++) {
            if (byteArray[i4] != 0) {
                throw formatIllegalArgumentException("BigInteger cannot be converted to InetAddress because it has more than %d bytes: %s", Integer.valueOf(i2), bigInteger);
            }
        }
        System.arraycopy(byteArray, max, bArr, i3, length);
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e) {
            throw new AssertionError(e);
        }
    }

    public static Inet4Address fromIPv4BigInteger(BigInteger bigInteger) {
        return (Inet4Address) fromBigInteger(bigInteger, false);
    }

    public static Inet6Address fromIPv6BigInteger(BigInteger bigInteger) {
        return (Inet6Address) fromBigInteger(bigInteger, true);
    }

    public static Inet4Address fromInteger(int i2) {
        return getInet4Address(Ints.toByteArray(i2));
    }

    public static InetAddress fromLittleEndianByteArray(byte[] bArr) throws UnknownHostException {
        byte[] bArr2 = new byte[bArr.length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr2[i2] = bArr[(bArr.length - i2) - 1];
        }
        return InetAddress.getByAddress(bArr2);
    }

    public static Inet4Address get6to4IPv4Address(Inet6Address inet6Address) {
        Preconditions.checkArgument(is6to4Address(inet6Address), "Address '%s' is not a 6to4 address.", toAddrString(inet6Address));
        return getInet4Address(Arrays.copyOfRange(inet6Address.getAddress(), 2, 6));
    }

    public static Inet4Address getCoercedIPv4Address(InetAddress inetAddress) {
        boolean z2;
        if (inetAddress instanceof Inet4Address) {
            return (Inet4Address) inetAddress;
        }
        byte[] address = inetAddress.getAddress();
        int i2 = 0;
        while (true) {
            if (i2 >= 15) {
                z2 = true;
                break;
            }
            if (address[i2] != 0) {
                z2 = false;
                break;
            }
            i2++;
        }
        if (z2 && address[15] == 1) {
            return LOOPBACK4;
        }
        if (z2 && address[15] == 0) {
            return ANY4;
        }
        Inet6Address inet6Address = (Inet6Address) inetAddress;
        int asInt = Hashing.murmur3_32_fixed().hashLong(hasEmbeddedIPv4ClientAddress(inet6Address) ? getEmbeddedIPv4ClientAddress(inet6Address).hashCode() : ByteBuffer.wrap(inet6Address.getAddress(), 0, 8).getLong()).asInt() | (-536870912);
        if (asInt == -1) {
            asInt = -2;
        }
        return getInet4Address(Ints.toByteArray(asInt));
    }

    public static Inet4Address getCompatIPv4Address(Inet6Address inet6Address) {
        Preconditions.checkArgument(isCompatIPv4Address(inet6Address), "Address '%s' is not IPv4-compatible.", toAddrString(inet6Address));
        return getInet4Address(Arrays.copyOfRange(inet6Address.getAddress(), 12, 16));
    }

    public static Inet4Address getEmbeddedIPv4ClientAddress(Inet6Address inet6Address) {
        if (isCompatIPv4Address(inet6Address)) {
            return getCompatIPv4Address(inet6Address);
        }
        if (is6to4Address(inet6Address)) {
            return get6to4IPv4Address(inet6Address);
        }
        if (isTeredoAddress(inet6Address)) {
            return getTeredoInfo(inet6Address).getClient();
        }
        throw formatIllegalArgumentException("'%s' has no embedded IPv4 address.", toAddrString(inet6Address));
    }

    private static Inet4Address getInet4Address(byte[] bArr) {
        Preconditions.checkArgument(bArr.length == 4, "Byte array has invalid length for an IPv4 address: %s != 4.", bArr.length);
        return (Inet4Address) bytesToInetAddress(bArr);
    }

    public static Inet4Address getIsatapIPv4Address(Inet6Address inet6Address) {
        Preconditions.checkArgument(isIsatapAddress(inet6Address), "Address '%s' is not an ISATAP address.", toAddrString(inet6Address));
        return getInet4Address(Arrays.copyOfRange(inet6Address.getAddress(), 12, 16));
    }

    public static TeredoInfo getTeredoInfo(Inet6Address inet6Address) {
        Preconditions.checkArgument(isTeredoAddress(inet6Address), "Address '%s' is not a Teredo address.", toAddrString(inet6Address));
        byte[] address = inet6Address.getAddress();
        Inet4Address inet4Address = getInet4Address(Arrays.copyOfRange(address, 4, 8));
        int readShort = ByteStreams.newDataInput(address, 8).readShort() & 65535;
        int i2 = 65535 & (~ByteStreams.newDataInput(address, 10).readShort());
        byte[] copyOfRange = Arrays.copyOfRange(address, 12, 16);
        for (int i3 = 0; i3 < copyOfRange.length; i3++) {
            copyOfRange[i3] = (byte) (~copyOfRange[i3]);
        }
        return new TeredoInfo(inet4Address, getInet4Address(copyOfRange), i2, readShort);
    }

    public static boolean hasEmbeddedIPv4ClientAddress(Inet6Address inet6Address) {
        return isCompatIPv4Address(inet6Address) || is6to4Address(inet6Address) || isTeredoAddress(inet6Address);
    }

    private static String hextetsToIPv6String(int[] iArr) {
        StringBuilder sb = new StringBuilder(39);
        int i2 = 0;
        boolean z2 = false;
        while (i2 < iArr.length) {
            boolean z3 = iArr[i2] >= 0;
            if (z3) {
                if (z2) {
                    sb.append(IPV6_DELIMITER);
                }
                sb.append(Integer.toHexString(iArr[i2]));
            } else if (i2 == 0 || z2) {
                sb.append("::");
            }
            i2++;
            z2 = z3;
        }
        return sb.toString();
    }

    public static InetAddress increment(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        int length = address.length - 1;
        while (true) {
            if (length < 0 || address[length] != -1) {
                break;
            }
            address[length] = 0;
            length--;
        }
        Preconditions.checkArgument(length >= 0, "Incrementing %s would wrap.", inetAddress);
        address[length] = (byte) (address[length] + 1);
        return bytesToInetAddress(address);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0032, code lost:
    
        if (r3 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0034, code lost:
    
        if (r2 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0036, code lost:
    
        r9 = convertDottedQuadToHex(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003a, code lost:
    
        if (r9 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003d, code lost:
    
        if (r1 == (-1)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003f, code lost:
    
        r9 = r9.substring(0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0047, code lost:
    
        return textToNumericFormatV6(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        if (r2 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004a, code lost:
    
        if (r1 == (-1)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0051, code lost:
    
        return textToNumericFormatV4(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0052, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] ipStringToBytes(java.lang.String r9) {
        /*
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
        L4:
            int r4 = r9.length()
            r5 = 0
            r6 = -1
            if (r1 >= r4) goto L31
            char r4 = r9.charAt(r1)
            r7 = 46
            r8 = 1
            if (r4 != r7) goto L17
            r2 = r8
            goto L2e
        L17:
            r7 = 58
            if (r4 != r7) goto L20
            if (r2 == 0) goto L1e
            return r5
        L1e:
            r3 = r8
            goto L2e
        L20:
            r7 = 37
            if (r4 != r7) goto L25
            goto L32
        L25:
            r7 = 16
            int r4 = java.lang.Character.digit(r4, r7)
            if (r4 != r6) goto L2e
            return r5
        L2e:
            int r1 = r1 + 1
            goto L4
        L31:
            r1 = r6
        L32:
            if (r3 == 0) goto L48
            if (r2 == 0) goto L3d
            java.lang.String r9 = convertDottedQuadToHex(r9)
            if (r9 != 0) goto L3d
            return r5
        L3d:
            if (r1 == r6) goto L43
            java.lang.String r9 = r9.substring(r0, r1)
        L43:
            byte[] r9 = textToNumericFormatV6(r9)
            return r9
        L48:
            if (r2 == 0) goto L52
            if (r1 == r6) goto L4d
            return r5
        L4d:
            byte[] r9 = textToNumericFormatV4(r9)
            return r9
        L52:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.net.InetAddresses.ipStringToBytes(java.lang.String):byte[]");
    }

    public static boolean is6to4Address(Inet6Address inet6Address) {
        byte[] address = inet6Address.getAddress();
        return address[0] == 32 && address[1] == 2;
    }

    public static boolean isCompatIPv4Address(Inet6Address inet6Address) {
        byte b2;
        if (!inet6Address.isIPv4CompatibleAddress()) {
            return false;
        }
        byte[] address = inet6Address.getAddress();
        return (address[12] == 0 && address[13] == 0 && address[14] == 0 && ((b2 = address[15]) == 0 || b2 == 1)) ? false : true;
    }

    public static boolean isInetAddress(String str) {
        return ipStringToBytes(str) != null;
    }

    public static boolean isIsatapAddress(Inet6Address inet6Address) {
        if (isTeredoAddress(inet6Address)) {
            return false;
        }
        byte[] address = inet6Address.getAddress();
        return (address[8] | 3) == 3 && address[9] == 0 && address[10] == 94 && address[11] == -2;
    }

    public static boolean isMappedIPv4Address(String str) {
        byte[] ipStringToBytes = ipStringToBytes(str);
        if (ipStringToBytes == null || ipStringToBytes.length != 16) {
            return false;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= 10) {
                for (int i3 = 10; i3 < 12; i3++) {
                    if (ipStringToBytes[i3] != -1) {
                        return false;
                    }
                }
                return true;
            }
            if (ipStringToBytes[i2] != 0) {
                return false;
            }
            i2++;
        }
    }

    public static boolean isMaximum(InetAddress inetAddress) {
        for (byte b2 : inetAddress.getAddress()) {
            if (b2 != -1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isTeredoAddress(Inet6Address inet6Address) {
        byte[] address = inet6Address.getAddress();
        return address[0] == 32 && address[1] == 1 && address[2] == 0 && address[3] == 0;
    }

    public static boolean isUriInetAddress(String str) {
        return forUriStringNoThrow(str) != null;
    }

    private static short parseHextet(String str, int i2, int i3) {
        int i4 = i3 - i2;
        if (i4 <= 0 || i4 > 4) {
            throw new NumberFormatException();
        }
        int i5 = 0;
        while (i2 < i3) {
            i5 = (i5 << 4) | Character.digit(str.charAt(i2), 16);
            i2++;
        }
        return (short) i5;
    }

    private static byte parseOctet(String str, int i2, int i3) {
        int i4 = i3 - i2;
        if (i4 <= 0 || i4 > 3) {
            throw new NumberFormatException();
        }
        if (i4 > 1 && str.charAt(i2) == '0') {
            throw new NumberFormatException();
        }
        int i5 = 0;
        while (i2 < i3) {
            int i6 = i5 * 10;
            int digit = Character.digit(str.charAt(i2), 10);
            if (digit < 0) {
                throw new NumberFormatException();
            }
            i5 = i6 + digit;
            i2++;
        }
        if (i5 <= 255) {
            return (byte) i5;
        }
        throw new NumberFormatException();
    }

    private static byte[] textToNumericFormatV4(String str) {
        if (IPV4_DELIMITER_MATCHER.countIn(str) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            int indexOf = str.indexOf(46, i2);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            try {
                bArr[i3] = parseOctet(str, i2, indexOf);
                i2 = indexOf + 1;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }

    private static byte[] textToNumericFormatV6(String str) {
        int countIn = IPV6_DELIMITER_MATCHER.countIn(str);
        if (countIn >= 2 && countIn <= 8) {
            int i2 = 1;
            int i3 = countIn + 1;
            int i4 = 8 - i3;
            boolean z2 = false;
            for (int i5 = 0; i5 < str.length() - 1; i5++) {
                if (str.charAt(i5) == ':' && str.charAt(i5 + 1) == ':') {
                    if (z2) {
                        return null;
                    }
                    int i6 = i4 + 1;
                    if (i5 == 0) {
                        i6 = i4 + 2;
                    }
                    if (i5 == str.length() - 2) {
                        i6++;
                    }
                    i4 = i6;
                    z2 = true;
                }
            }
            if (str.charAt(0) == ':' && str.charAt(1) != ':') {
                return null;
            }
            if (str.charAt(str.length() - 1) == ':' && str.charAt(str.length() - 2) != ':') {
                return null;
            }
            if (z2 && i4 <= 0) {
                return null;
            }
            if (!z2 && i3 != 8) {
                return null;
            }
            ByteBuffer allocate = ByteBuffer.allocate(16);
            try {
                if (str.charAt(0) != ':') {
                    i2 = 0;
                }
                while (i2 < str.length()) {
                    int indexOf = str.indexOf(58, i2);
                    if (indexOf == -1) {
                        indexOf = str.length();
                    }
                    if (str.charAt(i2) == ':') {
                        for (int i7 = 0; i7 < i4; i7++) {
                            allocate.putShort((short) 0);
                        }
                    } else {
                        allocate.putShort(parseHextet(str, i2, indexOf));
                    }
                    i2 = indexOf + 1;
                }
                return allocate.array();
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static String toAddrString(InetAddress inetAddress) {
        Preconditions.checkNotNull(inetAddress);
        if (inetAddress instanceof Inet4Address) {
            return inetAddress.getHostAddress();
        }
        Preconditions.checkArgument(inetAddress instanceof Inet6Address);
        byte[] address = inetAddress.getAddress();
        int[] iArr = new int[8];
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = i2 * 2;
            iArr[i2] = Ints.fromBytes((byte) 0, (byte) 0, address[i3], address[i3 + 1]);
        }
        compressLongestRunOfZeroes(iArr);
        return hextetsToIPv6String(iArr);
    }

    public static BigInteger toBigInteger(InetAddress inetAddress) {
        return new BigInteger(1, inetAddress.getAddress());
    }

    public static String toUriString(InetAddress inetAddress) {
        if (!(inetAddress instanceof Inet6Address)) {
            return toAddrString(inetAddress);
        }
        String addrString = toAddrString(inetAddress);
        return t.j(t.b(addrString, 2), "[", addrString, "]");
    }
}
