package com.glority.utils.store;

import com.glority.utils.data.StringUtils;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class IOUtils {
    private static int sBufferSize = 8192;

    public static boolean writeFileFromIS(String str, InputStream inputStream) {
        return writeFileFromIS(FileUtils.getFileByPath(str), inputStream, false);
    }

    public static boolean writeFileFromIS(String str, InputStream inputStream, boolean z) {
        return writeFileFromIS(FileUtils.getFileByPath(str), inputStream, z);
    }

    public static boolean writeFileFromIS(File file, InputStream inputStream) {
        return writeFileFromIS(file, inputStream, false);
    }

    public static boolean writeFileFromIS(File file, InputStream inputStream, boolean z) {
        if (!FileUtils.createOrExistsFile(file) || inputStream == null) {
            return false;
        }
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file, z));
                try {
                    byte[] bArr = new byte[sBufferSize];
                    while (true) {
                        int read = inputStream.read(bArr, 0, sBufferSize);
                        if (read != -1) {
                            bufferedOutputStream2.write(bArr, 0, read);
                        } else {
                            safeCloseAll(inputStream, bufferedOutputStream2);
                            return true;
                        }
                    }
                } catch (IOException e) {
                    e = e;
                    bufferedOutputStream = bufferedOutputStream2;
                    e.printStackTrace();
                    safeCloseAll(inputStream, bufferedOutputStream);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    safeCloseAll(inputStream, bufferedOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public static boolean writeFileFromBytesByStream(String str, byte[] bArr) {
        return writeFileFromBytesByStream(FileUtils.getFileByPath(str), bArr, false);
    }

    public static boolean writeFileFromBytesByStream(String str, byte[] bArr, boolean z) {
        return writeFileFromBytesByStream(FileUtils.getFileByPath(str), bArr, z);
    }

    public static boolean writeFileFromBytesByStream(File file, byte[] bArr) {
        return writeFileFromBytesByStream(file, bArr, false);
    }

    public static boolean writeFileFromBytesByStream(File file, byte[] bArr, boolean z) {
        if (bArr == null || !FileUtils.createOrExistsFile(file)) {
            return false;
        }
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file, z));
                try {
                    bufferedOutputStream2.write(bArr);
                    safeCloseAll(bufferedOutputStream2);
                    return true;
                } catch (IOException e) {
                    e = e;
                    bufferedOutputStream = bufferedOutputStream2;
                    e.printStackTrace();
                    safeCloseAll(bufferedOutputStream);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    safeCloseAll(bufferedOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public static boolean writeFileFromBytesByChannel(String str, byte[] bArr, boolean z) {
        return writeFileFromBytesByChannel(FileUtils.getFileByPath(str), bArr, false, z);
    }

    public static boolean writeFileFromBytesByChannel(String str, byte[] bArr, boolean z, boolean z2) {
        return writeFileFromBytesByChannel(FileUtils.getFileByPath(str), bArr, z, z2);
    }

    public static boolean writeFileFromBytesByChannel(File file, byte[] bArr, boolean z) {
        return writeFileFromBytesByChannel(file, bArr, false, z);
    }

    public static boolean writeFileFromBytesByChannel(File file, byte[] bArr, boolean z, boolean z2) {
        if (bArr == null) {
            return false;
        }
        FileChannel fileChannel = null;
        try {
            try {
                fileChannel = new FileOutputStream(file, z).getChannel();
                fileChannel.position(fileChannel.size());
                fileChannel.write(ByteBuffer.wrap(bArr));
                if (z2) {
                    fileChannel.force(true);
                }
                safeCloseAll(fileChannel);
                return true;
            } catch (IOException e) {
                e.printStackTrace();
                safeCloseAll(fileChannel);
                return false;
            }
        } catch (Throwable th) {
            safeCloseAll(fileChannel);
            throw th;
        }
    }

    public static boolean writeFileFromBytesByMap(String str, byte[] bArr, boolean z) {
        return writeFileFromBytesByMap(str, bArr, false, z);
    }

    public static boolean writeFileFromBytesByMap(String str, byte[] bArr, boolean z, boolean z2) {
        return writeFileFromBytesByMap(FileUtils.getFileByPath(str), bArr, z, z2);
    }

    public static boolean writeFileFromBytesByMap(File file, byte[] bArr, boolean z) {
        return writeFileFromBytesByMap(file, bArr, false, z);
    }

    public static boolean writeFileFromBytesByMap(File file, byte[] bArr, boolean z, boolean z2) {
        if (bArr == null || !FileUtils.createOrExistsFile(file)) {
            return false;
        }
        FileChannel fileChannel = null;
        try {
            try {
                fileChannel = new FileOutputStream(file, z).getChannel();
                MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_WRITE, fileChannel.size(), bArr.length);
                map.put(bArr);
                if (z2) {
                    map.force();
                }
                safeCloseAll(fileChannel);
                return true;
            } catch (IOException e) {
                e.printStackTrace();
                safeCloseAll(fileChannel);
                return false;
            }
        } catch (Throwable th) {
            safeCloseAll(fileChannel);
            throw th;
        }
    }

    public static boolean writeFileFromString(String str, String str2) {
        return writeFileFromString(FileUtils.getFileByPath(str), str2, false);
    }

    public static boolean writeFileFromString(String str, String str2, boolean z) {
        return writeFileFromString(FileUtils.getFileByPath(str), str2, z);
    }

    public static boolean writeFileFromString(File file, String str) {
        return writeFileFromString(file, str, false);
    }

    public static boolean writeFileFromString(File file, String str, boolean z) {
        if (file == null || str == null || !FileUtils.createOrExistsFile(file)) {
            return false;
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file, z));
                try {
                    bufferedWriter2.write(str);
                    safeCloseAll(bufferedWriter2);
                    return true;
                } catch (IOException e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    e.printStackTrace();
                    safeCloseAll(bufferedWriter);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    safeCloseAll(bufferedWriter);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static List<String> readFile2List(String str) {
        return readFile2List(FileUtils.getFileByPath(str), (String) null);
    }

    public static List<String> readFile2List(String str, String str2) {
        return readFile2List(FileUtils.getFileByPath(str), str2);
    }

    public static List<String> readFile2List(File file) {
        return readFile2List(file, 0, Integer.MAX_VALUE, (String) null);
    }

    public static List<String> readFile2List(File file, String str) {
        return readFile2List(file, 0, Integer.MAX_VALUE, str);
    }

    public static List<String> readFile2List(String str, int i, int i2) {
        return readFile2List(FileUtils.getFileByPath(str), i, i2, (String) null);
    }

    public static List<String> readFile2List(String str, int i, int i2, String str2) {
        return readFile2List(FileUtils.getFileByPath(str), i, i2, str2);
    }

    public static List<String> readFile2List(File file, int i, int i2) {
        return readFile2List(file, i, i2, (String) null);
    }

    public static List<String> readFile2List(File file, int i, int i2, String str) {
        BufferedReader bufferedReader;
        int i3;
        BufferedReader bufferedReader2 = null;
        if (!FileUtils.isFileExists(file) || i > i2) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (StringUtils.isSpace(str)) {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                i3 = 1;
            } else {
                BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(new FileInputStream(file), str));
                i3 = 1;
                bufferedReader = bufferedReader3;
            }
            while (true) {
                try {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null || i3 > i2) {
                            break;
                        }
                        if (i <= i3 && i3 <= i2) {
                            arrayList.add(readLine);
                        }
                        i3++;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                        safeCloseAll(bufferedReader2);
                        throw th;
                    }
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    safeCloseAll(bufferedReader);
                    return null;
                }
            }
            safeCloseAll(bufferedReader);
            return arrayList;
        } catch (IOException e2) {
            e = e2;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            safeCloseAll(bufferedReader2);
            throw th;
        }
    }

    public static String readFile2String(String str) {
        return readFile2String(FileUtils.getFileByPath(str), (String) null);
    }

    public static String readFile2String(String str, String str2) {
        return readFile2String(FileUtils.getFileByPath(str), str2);
    }

    public static String readFile2String(File file) {
        return readFile2String(file, (String) null);
    }

    public static String readFile2String(File file, String str) {
        byte[] readFile2BytesByStream = readFile2BytesByStream(file);
        if (readFile2BytesByStream == null) {
            return null;
        }
        if (StringUtils.isSpace(str)) {
            return new String(readFile2BytesByStream);
        }
        try {
            return new String(readFile2BytesByStream, str);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static byte[] readFile2BytesByStream(String str) {
        return readFile2BytesByStream(FileUtils.getFileByPath(str));
    }

    public static byte[] readFile2BytesByStream(File file) {
        if (!FileUtils.isFileExists(file)) {
            return null;
        }
        try {
            return is2Bytes(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] readFile2BytesByChannel(String str) {
        return readFile2BytesByChannel(FileUtils.getFileByPath(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static byte[] readFile2BytesByChannel(File file) {
        Throwable th;
        FileChannel fileChannel;
        if (!FileUtils.isFileExists(file)) {
            return null;
        }
        try {
            try {
                fileChannel = new RandomAccessFile(file, "r").getChannel();
            } catch (IOException e) {
                e = e;
                fileChannel = null;
            } catch (Throwable th2) {
                th = th2;
                file = null;
                safeCloseAll(file);
                throw th;
            }
            try {
                ByteBuffer allocate = ByteBuffer.allocate((int) fileChannel.size());
                do {
                } while (fileChannel.read(allocate) > 0);
                byte[] array = allocate.array();
                safeCloseAll(fileChannel);
                return array;
            } catch (IOException e2) {
                e = e2;
                e.printStackTrace();
                safeCloseAll(fileChannel);
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            safeCloseAll(file);
            throw th;
        }
    }

    public static byte[] readFile2BytesByMap(String str) {
        return readFile2BytesByMap(FileUtils.getFileByPath(str));
    }

    public static byte[] readFile2BytesByMap(File file) {
        Throwable th;
        FileChannel fileChannel;
        if (!FileUtils.isFileExists(file)) {
            return null;
        }
        try {
            fileChannel = new RandomAccessFile(file, "r").getChannel();
        } catch (IOException e) {
            e = e;
            fileChannel = null;
        } catch (Throwable th2) {
            th = th2;
            fileChannel = null;
            safeCloseAll(fileChannel);
            throw th;
        }
        try {
            try {
                int size = (int) fileChannel.size();
                byte[] bArr = new byte[size];
                fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, size).load().get(bArr, 0, size);
                safeCloseAll(fileChannel);
                return bArr;
            } catch (Throwable th3) {
                th = th3;
                safeCloseAll(fileChannel);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            e.printStackTrace();
            safeCloseAll(fileChannel);
            return null;
        }
    }

    public static byte[] is2Bytes(InputStream inputStream) {
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        IOException e;
        if (inputStream == null) {
            return new byte[0];
        }
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e2) {
                byteArrayOutputStream = null;
                e = e2;
            } catch (Throwable th2) {
                th = th2;
                safeCloseAll(inputStream, null);
                throw th;
            }
            try {
                byte[] bArr = new byte[sBufferSize];
                while (true) {
                    int read = inputStream.read(bArr, 0, sBufferSize);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        safeCloseAll(inputStream, byteArrayOutputStream);
                        return byteArray;
                    }
                }
            } catch (IOException e3) {
                e = e3;
                e.printStackTrace();
                byte[] bArr2 = new byte[0];
                safeCloseAll(inputStream, byteArrayOutputStream);
                return bArr2;
            }
        } catch (Throwable th3) {
            th = th3;
            safeCloseAll(inputStream, null);
            throw th;
        }
    }

    public static void safeCloseAll(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void setBufferSize(int i) {
        sBufferSize = i;
    }

    private IOUtils() {
        throw new UnsupportedOperationException("u can't initialize me!");
    }
}
