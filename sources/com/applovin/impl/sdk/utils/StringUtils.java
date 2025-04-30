package com.applovin.impl.sdk.utils;

import android.net.Uri;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import androidx.core.app.NotificationCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class StringUtils {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f11162a = "0123456789abcdef".toCharArray();

    /* loaded from: classes.dex */
    public class a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    private static String a(String str, Integer num) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes("UTF-8"));
            String hexString = toHexString(messageDigest.digest());
            if (num.intValue() > 0) {
                return hexString.substring(0, Math.min(num.intValue(), hexString.length()));
            }
            return hexString;
        } catch (Throwable th) {
            throw new RuntimeException(AbstractC2914a.e("SHA-1 for \"", str, "\" failed."), th);
        }
    }

    public static void addLinks(Spannable spannable, Pattern pattern, ClickableSpan clickableSpan, boolean z8) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            spannable.setSpan(clickableSpan, start, end, 33);
            if (z8) {
                spannable.setSpan(new StyleSpan(1), start, end, NotificationCompat.FLAG_LOCAL_ONLY);
            }
        }
    }

    public static String appendQueryParameter(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter(str2, str3);
            return buildUpon.build().toString();
        }
        return str;
    }

    public static String appendQueryParameters(String str, Map<String, String> map, boolean z8) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (map != null && !map.isEmpty()) {
            if (z8) {
                TreeMap treeMap = new TreeMap(new a());
                treeMap.putAll(map);
                map = treeMap;
            }
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            return buildUpon.build().toString();
        }
        return str;
    }

    public static boolean containsAtLeastOneSubstring(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsIgnoreCase(String str, String str2) {
        if (isValidString(str) && isValidString(str2) && str.toLowerCase().contains(str2.toLowerCase())) {
            return true;
        }
        return false;
    }

    public static SpannedString createListItemDetailSpannedString(String str, int i9) {
        return createSpannedString(str, i9, 16);
    }

    public static SpannedString createListItemDetailSubSpannedString(String str, int i9) {
        return createSpannedString(str, i9, 12, 1);
    }

    public static SpannedString createSpannedString(String str, int i9, int i10) {
        return createSpannedString(str, i9, i10, 0);
    }

    public static String emptyIfNull(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }

    public static String encodeUriString(String str) {
        if (isValidString(str)) {
            return Uri.encode(str);
        }
        return "";
    }

    public static Boolean endsWith(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.endsWith(it.next())) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public static String getHost(String str) {
        return Uri.parse(str).getHost();
    }

    public static String getHostAndPath(String str) {
        Uri parse = Uri.parse(str);
        return parse.getHost() + parse.getPath();
    }

    public static List<String> getRegexMatches(Matcher matcher, int i9) {
        matcher.reset();
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            String group = matcher.group(i9);
            if (isValidString(group)) {
                arrayList.add(group);
            }
        }
        return arrayList;
    }

    public static boolean isAlphaNumeric(String str) {
        if (isValidString(str)) {
            return str.matches("^[a-zA-Z0-9]*$");
        }
        return false;
    }

    public static boolean isNumeric(String str) {
        int i9;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char charAt = str.charAt(0);
        if (charAt != '-' && charAt != '+') {
            i9 = 0;
        } else {
            i9 = 1;
        }
        int length = str.length();
        if (i9 == 1 && length == 1) {
            return false;
        }
        while (i9 < length) {
            if (!Character.isDigit(str.charAt(i9))) {
                return false;
            }
            i9++;
        }
        return true;
    }

    public static boolean isValidString(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static String join(CharSequence charSequence, List<?> list) {
        if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(charSequence);
            }
            sb.delete((sb.length() - 1) - charSequence.length(), sb.length());
            return sb.toString();
        }
        return "";
    }

    public static Matcher match(String str, String str2) {
        return Pattern.compile(str2).matcher(str);
    }

    public static int parseInt(String str) {
        return parseInt(str, 0);
    }

    public static long parseLong(String str, long j7) {
        if (isNumeric(str)) {
            return Long.parseLong(str);
        }
        return j7;
    }

    public static String prefixToIndex(int i9, String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (i9 > str.length()) {
            i9 = str.length();
        }
        return str.substring(0, i9);
    }

    public static String replace(String str, String str2, String str3) {
        if (str3 != null) {
            if (str == null || str.length() < 1 || str2 == null || str2.length() < 1) {
                return str;
            }
            StringBuilder sb = new StringBuilder(str);
            int indexOf = sb.indexOf(str2);
            while (indexOf != -1) {
                sb.replace(indexOf, str2.length() + indexOf, str3);
                indexOf = sb.indexOf(str2, str3.length() + indexOf);
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("No replacement target specified");
    }

    public static boolean startsWithAtLeastOnePrefix(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static String toDigitsOnlyVersionString(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] split = str.split("\\.");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (isValidString(str2)) {
                String[] split2 = str2.split("[^0-9]+");
                if (split2.length > 0) {
                    arrayList.add(split2[0]);
                }
            }
        }
        return TextUtils.join(".", arrayList);
    }

    public static String toFullSHA1Hash(String str) {
        return a(str, -1);
    }

    public static String toHexString(byte[] bArr) {
        if (bArr != null) {
            char[] cArr = new char[bArr.length * 2];
            for (int i9 = 0; i9 < bArr.length; i9++) {
                int i10 = i9 * 2;
                char[] cArr2 = f11162a;
                byte b = bArr[i9];
                cArr[i10] = cArr2[(b & 240) >>> 4];
                cArr[i10 + 1] = cArr2[b & Ascii.SI];
            }
            return new String(cArr);
        }
        throw new IllegalArgumentException("No data specified");
    }

    public static String toHumanReadableString(String str) {
        if (!isValidString(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (String str2 : str.split("_")) {
            if (isValidString(str2)) {
                if (str2.equals("id")) {
                    sb.append(str2.toUpperCase(Locale.ENGLISH));
                } else {
                    String substring = str2.substring(0, 1);
                    Locale locale = Locale.ENGLISH;
                    sb.append(substring.toUpperCase(locale));
                    sb.append(str2.substring(1).toLowerCase(locale));
                }
                sb.append(" ");
            }
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    public static String toShortSHA1Hash(String str) {
        return a(str, 16);
    }

    public static SpannedString createSpannedString(String str, int i9, int i10, int i11) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(i9), 0, spannableString.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(i10, true), 0, spannableString.length(), 33);
        spannableString.setSpan(new StyleSpan(i11), 0, spannableString.length(), 33);
        return new SpannedString(spannableString);
    }

    public static int parseInt(String str, int i9) {
        return isNumeric(str) ? Integer.parseInt(str) : i9;
    }

    public static String replace(String str, Map<String, String> map) {
        if (str != null && map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                str = str.replace(entry.getKey(), entry.getValue());
            }
        }
        return str;
    }
}
