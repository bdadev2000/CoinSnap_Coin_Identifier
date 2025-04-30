package com.mbridge.msdk.playercommon.exoplayer2.util;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class UriUtil {
    private static final int FRAGMENT = 3;
    private static final int INDEX_COUNT = 4;
    private static final int PATH = 1;
    private static final int QUERY = 2;
    private static final int SCHEME_COLON = 0;

    private UriUtil() {
    }

    private static int[] getUriIndices(String str) {
        int i9;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i10 = indexOf4 + 2;
        if (i10 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i10) == '/') {
            i9 = str.indexOf(47, indexOf4 + 3);
            if (i9 == -1 || i9 > indexOf2) {
                i9 = indexOf2;
            }
        } else {
            i9 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i9;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    private static String removeDotSegments(StringBuilder sb, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (i9 >= i10) {
            return sb.toString();
        }
        if (sb.charAt(i9) == '/') {
            i9++;
        }
        int i14 = i9;
        int i15 = i14;
        while (i14 <= i10) {
            if (i14 == i10) {
                i11 = i14;
            } else if (sb.charAt(i14) == '/') {
                i11 = i14 + 1;
            } else {
                i14++;
            }
            int i16 = i15 + 1;
            if (i14 == i16 && sb.charAt(i15) == '.') {
                sb.delete(i15, i11);
                i10 -= i11 - i15;
            } else {
                if (i14 == i15 + 2 && sb.charAt(i15) == '.' && sb.charAt(i16) == '.') {
                    i12 = sb.lastIndexOf("/", i15 - 2) + 1;
                    if (i12 > i9) {
                        i13 = i12;
                    } else {
                        i13 = i9;
                    }
                    sb.delete(i13, i11);
                    i10 -= i11 - i13;
                } else {
                    i12 = i14 + 1;
                }
                i15 = i12;
            }
            i14 = i15;
        }
        return sb.toString();
    }

    public static Uri removeQueryParameter(Uri uri, String str) {
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.clearQuery();
        for (String str2 : uri.getQueryParameterNames()) {
            if (!str2.equals(str)) {
                Iterator<String> it = uri.getQueryParameters(str2).iterator();
                while (it.hasNext()) {
                    buildUpon.appendQueryParameter(str2, it.next());
                }
            }
        }
        return buildUpon.build();
    }

    public static String resolve(String str, String str2) {
        int i9;
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] uriIndices = getUriIndices(str2);
        if (uriIndices[0] != -1) {
            sb.append(str2);
            removeDotSegments(sb, uriIndices[1], uriIndices[2]);
            return sb.toString();
        }
        int[] uriIndices2 = getUriIndices(str);
        if (uriIndices[3] == 0) {
            sb.append((CharSequence) str, 0, uriIndices2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (uriIndices[2] == 0) {
            sb.append((CharSequence) str, 0, uriIndices2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i10 = uriIndices[1];
        if (i10 != 0) {
            int i11 = uriIndices2[0] + 1;
            sb.append((CharSequence) str, 0, i11);
            sb.append(str2);
            return removeDotSegments(sb, uriIndices[1] + i11, i11 + uriIndices[2]);
        }
        if (str2.charAt(i10) == '/') {
            sb.append((CharSequence) str, 0, uriIndices2[1]);
            sb.append(str2);
            int i12 = uriIndices2[1];
            return removeDotSegments(sb, i12, uriIndices[2] + i12);
        }
        int i13 = uriIndices2[0] + 2;
        int i14 = uriIndices2[1];
        if (i13 < i14 && i14 == uriIndices2[2]) {
            sb.append((CharSequence) str, 0, i14);
            sb.append('/');
            sb.append(str2);
            int i15 = uriIndices2[1];
            return removeDotSegments(sb, i15, uriIndices[2] + i15 + 1);
        }
        int lastIndexOf = str.lastIndexOf(47, uriIndices2[2] - 1);
        if (lastIndexOf == -1) {
            i9 = uriIndices2[1];
        } else {
            i9 = lastIndexOf + 1;
        }
        sb.append((CharSequence) str, 0, i9);
        sb.append(str2);
        return removeDotSegments(sb, uriIndices2[1], i9 + uriIndices[2]);
    }

    public static Uri resolveToUri(String str, String str2) {
        return Uri.parse(resolve(str, str2));
    }
}
