package com.glority.utils.store;

import android.app.Application;
import android.content.ContentUris;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.support.v4.media.session.PlaybackStateCompat;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.Constants;
import com.glority.utils.UtilsApp;
import com.glority.utils.data.StringUtils;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.net.HttpHeaders;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class FileUtils {
    private static final String LINE_SEP = System.getProperty("line.separator");

    /* loaded from: classes9.dex */
    public interface OnReplaceListener {
        boolean onReplace();
    }

    public static boolean isStorageReadable() {
        return "mounted_ro".equals(Environment.getExternalStorageState());
    }

    public static boolean isStorageWritable() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public static String getFilePath(Uri uri) {
        Application app = UtilsApp.getApp();
        if (DocumentsContract.isDocumentUri(app, uri)) {
            if (isExternalStorageDocument(uri)) {
                String[] split = DocumentsContract.getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(split[0])) {
                    return Environment.getExternalStorageDirectory() + RemoteSettings.FORWARD_SLASH_STRING + split[1];
                }
            } else {
                if (isDownloadsDocument(uri)) {
                    return getDataColumn(app, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.parseLong(DocumentsContract.getDocumentId(uri))), null, null);
                }
                if (isMediaDocument(uri)) {
                    String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                    return getDataColumn(app, createURI(split2[0]), "_id=?", new String[]{split2[1]});
                }
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return getDataColumn(app, uri, null, null);
            }
            if (TransferTable.COLUMN_FILE.equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    public static File getFileByPath(String str) {
        if (StringUtils.isSpace(str)) {
            return null;
        }
        return new File(str);
    }

    public static boolean isFileExists(String str) {
        return isFileExists(getFileByPath(str));
    }

    public static boolean isFileExists(File file) {
        return file != null && file.exists();
    }

    public static boolean isFile(String str) {
        return isFile(getFileByPath(str));
    }

    public static boolean isFile(File file) {
        return file != null && file.exists() && file.isFile();
    }

    public static boolean isDir(String str) {
        return isDir(getFileByPath(str));
    }

    public static boolean isDir(File file) {
        return file != null && file.exists() && file.isDirectory();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
    
        if (0 == 0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getFileName(android.net.Uri r9) {
        /*
            java.lang.String r0 = "_display_name"
            r1 = 0
            android.app.Application r2 = com.glority.utils.UtilsApp.getApp()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36 java.lang.SecurityException -> L3d
            android.content.ContentResolver r3 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36 java.lang.SecurityException -> L3d
            r2 = 1
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36 java.lang.SecurityException -> L3d
            r2 = 0
            r5[r2] = r0     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36 java.lang.SecurityException -> L3d
            r7 = 0
            r8 = 0
            r6 = 0
            r4 = r9
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36 java.lang.SecurityException -> L3d
            if (r1 == 0) goto L2a
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36 java.lang.SecurityException -> L3d
            if (r2 == 0) goto L2a
            int r9 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36 java.lang.SecurityException -> L3d
            java.lang.String r9 = r1.getString(r9)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36 java.lang.SecurityException -> L3d
            goto L2e
        L2a:
            java.lang.String r9 = r9.getLastPathSegment()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36 java.lang.SecurityException -> L3d
        L2e:
            if (r1 == 0) goto L48
            r1.close()
            goto L48
        L34:
            r9 = move-exception
            goto L49
        L36:
            r9 = move-exception
            r9.printStackTrace()     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L46
            goto L43
        L3d:
            r9 = move-exception
            r9.printStackTrace()     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L46
        L43:
            r1.close()
        L46:
            java.lang.String r9 = ""
        L48:
            return r9
        L49:
            if (r1 == 0) goto L4e
            r1.close()
        L4e:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.utils.store.FileUtils.getFileName(android.net.Uri):java.lang.String");
    }

    public static String getFileName(File file) {
        if (file == null) {
            return "";
        }
        return getFileName(file.getAbsolutePath());
    }

    public static String getFileName(String str) {
        if (StringUtils.isSpace(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(File.separator);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }

    public static String getFileNameNoExtension(File file) {
        if (file == null) {
            return "";
        }
        return getFileNameNoExtension(file.getPath());
    }

    public static String getFileNameNoExtension(String str) {
        if (StringUtils.isSpace(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        int lastIndexOf2 = str.lastIndexOf(File.separator);
        if (lastIndexOf2 == -1) {
            return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
        }
        if (lastIndexOf == -1 || lastIndexOf2 > lastIndexOf) {
            return str.substring(lastIndexOf2 + 1);
        }
        return str.substring(lastIndexOf2 + 1, lastIndexOf);
    }

    public static String getFileExtension(File file) {
        if (file == null) {
            return "";
        }
        return getFileExtension(file.getPath());
    }

    public static String getFileExtension(String str) {
        if (StringUtils.isSpace(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return (lastIndexOf == -1 || str.lastIndexOf(File.separator) >= lastIndexOf) ? "" : str.substring(lastIndexOf + 1);
    }

    public static String getDirName(File file) {
        if (file == null) {
            return "";
        }
        return getDirName(file.getAbsolutePath());
    }

    public static String getDirName(String str) {
        int lastIndexOf;
        return (StringUtils.isSpace(str) || (lastIndexOf = str.lastIndexOf(File.separator)) == -1) ? "" : str.substring(0, lastIndexOf + 1);
    }

    public static long getFileLastModified(String str) {
        return getFileLastModified(getFileByPath(str));
    }

    public static long getFileLastModified(File file) {
        if (file == null) {
            return -1L;
        }
        return file.lastModified();
    }

    public static String getFileCharsetSimple(String str) {
        return getFileCharsetSimple(getFileByPath(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getFileCharsetSimple(java.io.File r3) {
        /*
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
            int r3 = r1.read()     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L22
            int r3 = r3 << 8
            int r0 = r1.read()     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L22
            int r3 = r3 + r0
            r1.close()     // Catch: java.io.IOException -> L1a
            goto L36
        L1a:
            r0 = move-exception
            r0.printStackTrace()
            goto L36
        L1f:
            r3 = move-exception
            r0 = r1
            goto L51
        L22:
            r3 = move-exception
            r0 = r1
            goto L28
        L25:
            r3 = move-exception
            goto L51
        L27:
            r3 = move-exception
        L28:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L35
            r0.close()     // Catch: java.io.IOException -> L31
            goto L35
        L31:
            r3 = move-exception
            r3.printStackTrace()
        L35:
            r3 = 0
        L36:
            r0 = 61371(0xefbb, float:8.5999E-41)
            if (r3 == r0) goto L4e
            r0 = 65279(0xfeff, float:9.1475E-41)
            if (r3 == r0) goto L4b
            r0 = 65534(0xfffe, float:9.1833E-41)
            if (r3 == r0) goto L48
            java.lang.String r3 = "GBK"
            return r3
        L48:
            java.lang.String r3 = "Unicode"
            return r3
        L4b:
            java.lang.String r3 = "UTF-16BE"
            return r3
        L4e:
            java.lang.String r3 = "UTF-8"
            return r3
        L51:
            if (r0 == 0) goto L5b
            r0.close()     // Catch: java.io.IOException -> L57
            goto L5b
        L57:
            r0 = move-exception
            r0.printStackTrace()
        L5b:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.utils.store.FileUtils.getFileCharsetSimple(java.io.File):java.lang.String");
    }

    public static int getFileLines(String str) {
        return getFileLines(getFileByPath(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r3 == (-1)) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        if (r6 >= r3) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r1[r6] != 10) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r2.close();
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0030, code lost:
    
        r3 = r2.read(r1, 0, 1024);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0034, code lost:
    
        if (r3 == (-1)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0036, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0037, code lost:
    
        if (r6 >= r3) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003d, code lost:
    
        if (r1[r6] != 13) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003f, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0041, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (com.glority.utils.store.FileUtils.LINE_SEP.endsWith("\n") != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r3 = r2.read(r1, 0, 1024);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0049 -> B:18:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getFileLines(java.io.File r9) {
        /*
            r0 = 1
            r1 = 0
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            r9 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r9]     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            java.lang.String r3 = com.glority.utils.store.FileUtils.LINE_SEP     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            java.lang.String r4 = "\n"
            boolean r3 = r3.endsWith(r4)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            r4 = -1
            r5 = 0
            if (r3 == 0) goto L30
        L1c:
            int r3 = r2.read(r1, r5, r9)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            if (r3 == r4) goto L44
            r6 = r5
        L23:
            if (r6 >= r3) goto L1c
            r7 = r1[r6]     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            r8 = 10
            if (r7 != r8) goto L2d
            int r0 = r0 + 1
        L2d:
            int r6 = r6 + 1
            goto L23
        L30:
            int r3 = r2.read(r1, r5, r9)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            if (r3 == r4) goto L44
            r6 = r5
        L37:
            if (r6 >= r3) goto L30
            r7 = r1[r6]     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            r8 = 13
            if (r7 != r8) goto L41
            int r0 = r0 + 1
        L41:
            int r6 = r6 + 1
            goto L37
        L44:
            r2.close()     // Catch: java.io.IOException -> L48
            goto L5e
        L48:
            r9 = move-exception
            r9.printStackTrace()
            goto L5e
        L4d:
            r9 = move-exception
            r1 = r2
            goto L5f
        L50:
            r9 = move-exception
            r1 = r2
            goto L56
        L53:
            r9 = move-exception
            goto L5f
        L55:
            r9 = move-exception
        L56:
            r9.printStackTrace()     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L5e
            r1.close()     // Catch: java.io.IOException -> L48
        L5e:
            return r0
        L5f:
            if (r1 == 0) goto L69
            r1.close()     // Catch: java.io.IOException -> L65
            goto L69
        L65:
            r0 = move-exception
            r0.printStackTrace()
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.utils.store.FileUtils.getFileLines(java.io.File):int");
    }

    public static String getDirSize(String str) {
        return getDirSize(getFileByPath(str));
    }

    public static String getDirSize(File file) {
        long dirLength = getDirLength(file);
        return dirLength == -1 ? "" : byte2FitMemorySize(dirLength);
    }

    public static String getFileSize(String str) {
        long fileLength = getFileLength(str);
        return fileLength == -1 ? "" : byte2FitMemorySize(fileLength);
    }

    public static String getFileSize(File file) {
        long fileLength = getFileLength(file);
        return fileLength == -1 ? "" : byte2FitMemorySize(fileLength);
    }

    public static long getDirLength(String str) {
        return getDirLength(getFileByPath(str));
    }

    public static long getDirLength(File file) {
        long length;
        if (!isDir(file)) {
            return -1L;
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    length = getDirLength(file2);
                } else {
                    length = file2.length();
                }
                j += length;
            }
        }
        return j;
    }

    public static long getFileLength(String str) {
        if (str.matches("[a-zA-z]+://[^\\s]*")) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "identity");
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 200) {
                    return httpURLConnection.getContentLength();
                }
                return -1L;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return getFileLength(getFileByPath(str));
    }

    public static long getFileLength(File file) {
        if (isFile(file)) {
            return file.length();
        }
        return -1L;
    }

    public static String getFileMD5ToString(String str) {
        return getFileMD5ToString(StringUtils.isSpace(str) ? null : new File(str));
    }

    public static String getFileMD5ToString(File file) {
        return StringUtils.bytes2HexString(getFileMD5(file));
    }

    public static byte[] getFileMD5(String str) {
        return getFileMD5(getFileByPath(str));
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0048: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:46:0x0048 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] getFileMD5(java.io.File r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L35 java.security.NoSuchAlgorithmException -> L37
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L35 java.security.NoSuchAlgorithmException -> L37
            java.lang.String r3 = "MD5"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L35 java.security.NoSuchAlgorithmException -> L37
            java.security.DigestInputStream r2 = new java.security.DigestInputStream     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L35 java.security.NoSuchAlgorithmException -> L37
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L35 java.security.NoSuchAlgorithmException -> L37
            r3 = 262144(0x40000, float:3.67342E-40)
            byte[] r3 = new byte[r3]     // Catch: java.io.IOException -> L2f java.security.NoSuchAlgorithmException -> L31 java.lang.Throwable -> L47
        L18:
            int r1 = r2.read(r3)     // Catch: java.io.IOException -> L2f java.security.NoSuchAlgorithmException -> L31 java.lang.Throwable -> L47
            if (r1 > 0) goto L18
            java.security.MessageDigest r3 = r2.getMessageDigest()     // Catch: java.io.IOException -> L2f java.security.NoSuchAlgorithmException -> L31 java.lang.Throwable -> L47
            byte[] r3 = r3.digest()     // Catch: java.io.IOException -> L2f java.security.NoSuchAlgorithmException -> L31 java.lang.Throwable -> L47
            r2.close()     // Catch: java.io.IOException -> L2a
            goto L2e
        L2a:
            r0 = move-exception
            r0.printStackTrace()
        L2e:
            return r3
        L2f:
            r3 = move-exception
            goto L39
        L31:
            r3 = move-exception
            goto L39
        L33:
            r3 = move-exception
            goto L49
        L35:
            r3 = move-exception
            goto L38
        L37:
            r3 = move-exception
        L38:
            r2 = r0
        L39:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L46
            r2.close()     // Catch: java.io.IOException -> L42
            goto L46
        L42:
            r3 = move-exception
            r3.printStackTrace()
        L46:
            return r0
        L47:
            r3 = move-exception
            r0 = r2
        L49:
            if (r0 == 0) goto L53
            r0.close()     // Catch: java.io.IOException -> L4f
            goto L53
        L4f:
            r0 = move-exception
            r0.printStackTrace()
        L53:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.utils.store.FileUtils.getFileMD5(java.io.File):byte[]");
    }

    public static List<File> listFilesInDir(String str) {
        return listFilesInDir(str, false);
    }

    public static List<File> listFilesInDir(File file) {
        return listFilesInDir(file, false);
    }

    public static List<File> listFilesInDir(String str, boolean z) {
        return listFilesInDir(getFileByPath(str), z);
    }

    public static List<File> listFilesInDir(File file, boolean z) {
        return listFilesInDirWithFilter(file, new FileFilter() { // from class: com.glority.utils.store.FileUtils.1
            @Override // java.io.FileFilter
            public boolean accept(File file2) {
                return true;
            }
        }, z);
    }

    public static List<File> listFilesInDirWithFilter(String str, FileFilter fileFilter) {
        return listFilesInDirWithFilter(getFileByPath(str), fileFilter, false);
    }

    public static List<File> listFilesInDirWithFilter(File file, FileFilter fileFilter) {
        return listFilesInDirWithFilter(file, fileFilter, false);
    }

    public static List<File> listFilesInDirWithFilter(String str, FileFilter fileFilter, boolean z) {
        return listFilesInDirWithFilter(getFileByPath(str), fileFilter, z);
    }

    public static List<File> listFilesInDirWithFilter(File file, FileFilter fileFilter, boolean z) {
        if (!isDir(file)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                if (fileFilter.accept(file2)) {
                    arrayList.add(file2);
                }
                if (z && file2.isDirectory()) {
                    arrayList.addAll(listFilesInDirWithFilter(file2, fileFilter, true));
                }
            }
        }
        return arrayList;
    }

    public static boolean createOrExistsDir(String str) {
        return createOrExistsDir(getFileByPath(str));
    }

    public static boolean createOrExistsFile(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!createOrExistsDir(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean createFileByDeleteOldFile(String str) {
        return createFileByDeleteOldFile(getFileByPath(str));
    }

    public static boolean createFileByDeleteOldFile(File file) {
        if (file == null) {
            return false;
        }
        if ((file.exists() && !file.delete()) || !createOrExistsDir(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean rename(File file, String str) {
        if (file == null || !file.exists() || StringUtils.isSpace(str)) {
            return false;
        }
        if (str.equals(file.getName())) {
            return true;
        }
        File file2 = new File(file.getParent() + File.separator + str);
        return !file2.exists() && file.renameTo(file2);
    }

    public static boolean copyFile(String str, String str2) {
        return copyFile(getFileByPath(str), getFileByPath(str2));
    }

    public static boolean copyFile(String str, String str2, OnReplaceListener onReplaceListener) {
        return copyFile(getFileByPath(str), getFileByPath(str2), onReplaceListener);
    }

    public static boolean copyFile(File file, File file2) {
        return copyOrMoveFile(file, file2, false);
    }

    public static boolean copyFile(File file, File file2, OnReplaceListener onReplaceListener) {
        return copyOrMoveFile(file, file2, onReplaceListener, false);
    }

    public static boolean moveFile(String str, String str2) {
        return moveFile(getFileByPath(str), getFileByPath(str2));
    }

    public static boolean moveFile(String str, String str2, OnReplaceListener onReplaceListener) {
        return moveFile(getFileByPath(str), getFileByPath(str2), onReplaceListener);
    }

    public static boolean moveFile(File file, File file2) {
        return copyOrMoveFile(file, file2, true);
    }

    public static boolean moveFile(File file, File file2, OnReplaceListener onReplaceListener) {
        return copyOrMoveFile(file, file2, onReplaceListener, true);
    }

    public static boolean copyDir(String str, String str2) {
        return copyDir(getFileByPath(str), getFileByPath(str2));
    }

    public static boolean copyDir(String str, String str2, OnReplaceListener onReplaceListener) {
        return copyDir(getFileByPath(str), getFileByPath(str2), onReplaceListener);
    }

    public static boolean copyDir(File file, File file2) {
        return copyOrMoveDir(file, file2, false);
    }

    public static boolean copyDir(File file, File file2, OnReplaceListener onReplaceListener) {
        return copyOrMoveDir(file, file2, onReplaceListener, false);
    }

    public static boolean moveDir(String str, String str2) {
        return moveDir(getFileByPath(str), getFileByPath(str2));
    }

    public static boolean moveDir(String str, String str2, OnReplaceListener onReplaceListener) {
        return moveDir(getFileByPath(str), getFileByPath(str2), onReplaceListener);
    }

    public static boolean moveDir(File file, File file2) {
        return copyOrMoveDir(file, file2, true);
    }

    public static boolean moveDir(File file, File file2, OnReplaceListener onReplaceListener) {
        return copyOrMoveDir(file, file2, onReplaceListener, true);
    }

    public static boolean delete(String str) {
        return delete(getFileByPath(str));
    }

    public static boolean delete(File file) {
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            return deleteDir(file);
        }
        return deleteFile(file);
    }

    public static boolean deleteDir(String str) {
        return deleteDir(getFileByPath(str));
    }

    public static boolean deleteDir(File file) {
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    if (!file2.delete()) {
                        return false;
                    }
                } else if (file2.isDirectory() && !deleteDir(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public static boolean deleteFile(String str) {
        return deleteFile(getFileByPath(str));
    }

    public static boolean deleteFile(File file) {
        return file != null && (!file.exists() || (file.isFile() && file.delete()));
    }

    public static boolean deleteAllInDir(String str) {
        return deleteAllInDir(getFileByPath(str));
    }

    public static boolean deleteAllInDir(File file) {
        return deleteFilesInDirWithFilter(file, new FileFilter() { // from class: com.glority.utils.store.FileUtils.2
            @Override // java.io.FileFilter
            public boolean accept(File file2) {
                return true;
            }
        });
    }

    public static boolean deleteFilesInDir(String str) {
        return deleteFilesInDir(getFileByPath(str));
    }

    public static boolean deleteFilesInDir(File file) {
        return deleteFilesInDirWithFilter(file, new FileFilter() { // from class: com.glority.utils.store.FileUtils.3
            @Override // java.io.FileFilter
            public boolean accept(File file2) {
                return file2.isFile();
            }
        });
    }

    public static boolean deleteFilesInDirWithFilter(String str, FileFilter fileFilter) {
        return deleteFilesInDirWithFilter(getFileByPath(str), fileFilter);
    }

    public static boolean deleteFilesInDirWithFilter(File file, FileFilter fileFilter) {
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                if (fileFilter.accept(file2)) {
                    if (file2.isFile()) {
                        if (!file2.delete()) {
                            return false;
                        }
                    } else if (file2.isDirectory() && !deleteDir(file2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static String byte2FitMemorySize(long j) {
        if (j < 0) {
            return "shouldn't be less than zero!";
        }
        if (j < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            return String.format(Locale.getDefault(), "%.3fB", Double.valueOf(j));
        }
        if (j < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            return String.format(Locale.getDefault(), "%.3fKB", Double.valueOf(j / 1024.0d));
        }
        if (j < Constants.GB) {
            return String.format(Locale.getDefault(), "%.3fMB", Double.valueOf(j / 1048576.0d));
        }
        return String.format(Locale.getDefault(), "%.3fGB", Double.valueOf(j / 1.073741824E9d));
    }

    private static boolean createOrExistsDir(File file) {
        return file != null && (!file.exists() ? !file.mkdirs() : !file.isDirectory());
    }

    private static boolean copyOrMoveFile(File file, File file2, boolean z) {
        return copyOrMoveFile(file, file2, new OnReplaceListener() { // from class: com.glority.utils.store.FileUtils.4
            @Override // com.glority.utils.store.FileUtils.OnReplaceListener
            public boolean onReplace() {
                return true;
            }
        }, z);
    }

    private static boolean copyOrMoveFile(File file, File file2, OnReplaceListener onReplaceListener, boolean z) {
        if (file != null && file2 != null && !file.equals(file2) && file.exists() && file.isFile()) {
            if (file2.exists()) {
                if (onReplaceListener != null && !onReplaceListener.onReplace()) {
                    return true;
                }
                if (!file2.delete()) {
                    return false;
                }
            }
            if (!createOrExistsDir(file2.getParentFile())) {
                return false;
            }
            try {
                if (!writeFileFromIS(file2, new FileInputStream(file))) {
                    return false;
                }
                if (z) {
                    if (!deleteFile(file)) {
                        return false;
                    }
                }
                return true;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    private static boolean copyOrMoveDir(File file, File file2, boolean z) {
        return copyOrMoveDir(file, file2, new OnReplaceListener() { // from class: com.glority.utils.store.FileUtils.5
            @Override // com.glority.utils.store.FileUtils.OnReplaceListener
            public boolean onReplace() {
                return true;
            }
        }, z);
    }

    private static boolean copyOrMoveDir(File file, File file2, OnReplaceListener onReplaceListener, boolean z) {
        if (file == null || file2 == null) {
            return false;
        }
        String str = file.getPath() + File.separator;
        String str2 = file2.getPath() + File.separator;
        if (str2.contains(str) || !file.exists() || !file.isDirectory()) {
            return false;
        }
        if (file2.exists()) {
            if (onReplaceListener != null && !onReplaceListener.onReplace()) {
                return true;
            }
            if (!deleteAllInDir(file2)) {
                return false;
            }
        }
        if (!createOrExistsDir(file2)) {
            return false;
        }
        for (File file3 : file.listFiles()) {
            File file4 = new File(str2 + file3.getName());
            if (file3.isFile()) {
                if (!copyOrMoveFile(file3, file4, onReplaceListener, z)) {
                    return false;
                }
            } else if (file3.isDirectory() && !copyOrMoveDir(file3, file4, onReplaceListener, z)) {
                return false;
            }
        }
        return !z || deleteDir(file);
    }

    private static boolean writeFileFromIS(File file, InputStream inputStream) {
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = inputStream.read(bArr, 0, 8192);
                        if (read != -1) {
                            bufferedOutputStream2.write(bArr, 0, read);
                        } else {
                            try {
                                break;
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    inputStream.close();
                    try {
                        bufferedOutputStream2.close();
                        return true;
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        return true;
                    }
                } catch (IOException e3) {
                    e = e3;
                    bufferedOutputStream = bufferedOutputStream2;
                    e.printStackTrace();
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    try {
                        inputStream.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                            throw th;
                        } catch (IOException e7) {
                            e7.printStackTrace();
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (IOException e8) {
                e = e8;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    private static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    private static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        if (r8 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002b, code lost:
    
        if (r8 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        r8.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String getDataColumn(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            if (r8 == 0) goto L2b
            boolean r9 = r8.moveToFirst()     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L3b
            if (r9 == 0) goto L2b
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L3b
            java.lang.String r9 = r8.getString(r9)     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L3b
            if (r8 == 0) goto L28
            r8.close()
        L28:
            return r9
        L29:
            r9 = move-exception
            goto L32
        L2b:
            if (r8 == 0) goto L3a
            goto L37
        L2e:
            r9 = move-exception
            goto L3d
        L30:
            r9 = move-exception
            r8 = r7
        L32:
            r9.printStackTrace()     // Catch: java.lang.Throwable -> L3b
            if (r8 == 0) goto L3a
        L37:
            r8.close()
        L3a:
            return r7
        L3b:
            r9 = move-exception
            r7 = r8
        L3d:
            if (r7 == 0) goto L42
            r7.close()
        L42:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.utils.store.FileUtils.getDataColumn(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    private static Uri createURI(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 93166550:
                if (str.equals(MimeTypes.BASE_TYPE_AUDIO)) {
                    c = 0;
                    break;
                }
                break;
            case 100313435:
                if (str.equals("image")) {
                    c = 1;
                    break;
                }
                break;
            case 112202875:
                if (str.equals(MimeTypes.BASE_TYPE_VIDEO)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            case 1:
                return MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            case 2:
                return MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            default:
                return null;
        }
    }

    private FileUtils() {
        throw new UnsupportedOperationException("u can't initialize me!");
    }
}
