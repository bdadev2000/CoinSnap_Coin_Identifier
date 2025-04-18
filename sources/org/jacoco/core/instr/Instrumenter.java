package org.jacoco.core.instr;

import androidx.compose.foundation.text.input.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import org.jacoco.core.JaCoCo;
import org.jacoco.core.internal.ContentTypeDetector;
import org.jacoco.core.internal.InputStreams;
import org.jacoco.core.internal.Pack200Streams;
import org.jacoco.core.internal.data.CRC64;
import org.jacoco.core.internal.flow.ClassProbesAdapter;
import org.jacoco.core.internal.instr.ClassInstrumenter;
import org.jacoco.core.internal.instr.InstrSupport;
import org.jacoco.core.internal.instr.ProbeArrayStrategyFactory;
import org.jacoco.core.internal.instr.SignatureRemover;
import org.jacoco.core.runtime.IExecutionDataAccessorGenerator;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

/* loaded from: classes3.dex */
public class Instrumenter {
    private final IExecutionDataAccessorGenerator accessorGenerator;
    private final SignatureRemover signatureRemover = new SignatureRemover();

    public Instrumenter(IExecutionDataAccessorGenerator iExecutionDataAccessorGenerator) {
        this.accessorGenerator = iExecutionDataAccessorGenerator;
    }

    private void copy(InputStream inputStream, OutputStream outputStream, String str) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = read(inputStream, bArr, str);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    private static long crc(byte[] bArr) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        return crc32.getValue();
    }

    private int filterOrInstrument(InputStream inputStream, OutputStream outputStream, String str, String str2) throws IOException {
        if (this.signatureRemover.filterEntry(str2, inputStream, outputStream)) {
            return 0;
        }
        return instrumentAll(inputStream, outputStream, a.k(str, "@", str2));
    }

    private byte[] instrument(byte[] bArr) {
        long classId = CRC64.classId(bArr);
        ClassReader classReaderFor = InstrSupport.classReaderFor(bArr);
        ClassWriter classWriter = new ClassWriter(classReaderFor, 0) { // from class: org.jacoco.core.instr.Instrumenter.1
            @Override // org.objectweb.asm.ClassWriter
            public String getCommonSuperClass(String str, String str2) {
                throw new IllegalStateException();
            }
        };
        classReaderFor.accept(new ClassProbesAdapter(new ClassInstrumenter(ProbeArrayStrategyFactory.createFor(classId, classReaderFor, this.accessorGenerator), classWriter), InstrSupport.needsFrames(InstrSupport.getMajorVersion(classReaderFor))), 8);
        return classWriter.toByteArray();
    }

    private IOException instrumentError(String str, Exception exc) {
        IOException iOException = new IOException(String.format("Error while instrumenting %s with JaCoCo %s/%s.", str, JaCoCo.VERSION, JaCoCo.COMMITID_SHORT));
        iOException.initCause(exc);
        return iOException;
    }

    private int instrumentGzip(InputStream inputStream, OutputStream outputStream, String str) throws IOException {
        try {
            InputStream gZIPInputStream = new GZIPInputStream(inputStream);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            int instrumentAll = instrumentAll(gZIPInputStream, gZIPOutputStream, str);
            gZIPOutputStream.finish();
            return instrumentAll;
        } catch (IOException e) {
            throw instrumentError(str, e);
        }
    }

    private int instrumentPack200(InputStream inputStream, OutputStream outputStream, String str) throws IOException {
        try {
            InputStream unpack = Pack200Streams.unpack(inputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int instrumentAll = instrumentAll(unpack, byteArrayOutputStream, str);
            Pack200Streams.pack(byteArrayOutputStream.toByteArray(), outputStream);
            return instrumentAll;
        } catch (IOException e) {
            throw instrumentError(str, e);
        }
    }

    private int instrumentZip(InputStream inputStream, OutputStream outputStream, String str) throws IOException {
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream);
        int i2 = 0;
        while (true) {
            ZipEntry nextEntry = nextEntry(zipInputStream, str);
            if (nextEntry == null) {
                zipOutputStream.finish();
                return i2;
            }
            String name = nextEntry.getName();
            if (!this.signatureRemover.removeEntry(name)) {
                ZipEntry zipEntry = new ZipEntry(name);
                zipEntry.setMethod(nextEntry.getMethod());
                int method = nextEntry.getMethod();
                if (method == 0) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    i2 += filterOrInstrument(zipInputStream, byteArrayOutputStream, str, name);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    zipEntry.setSize(byteArray.length);
                    zipEntry.setCompressedSize(byteArray.length);
                    zipEntry.setCrc(crc(byteArray));
                    zipOutputStream.putNextEntry(zipEntry);
                    zipOutputStream.write(byteArray);
                } else {
                    if (method != 8) {
                        throw new AssertionError(nextEntry.getMethod());
                    }
                    zipOutputStream.putNextEntry(zipEntry);
                    i2 += filterOrInstrument(zipInputStream, zipOutputStream, str, name);
                }
                zipOutputStream.closeEntry();
            }
        }
    }

    private ZipEntry nextEntry(ZipInputStream zipInputStream, String str) throws IOException {
        try {
            return zipInputStream.getNextEntry();
        } catch (IOException e) {
            throw instrumentError(str, e);
        }
    }

    private int read(InputStream inputStream, byte[] bArr, String str) throws IOException {
        try {
            return inputStream.read(bArr);
        } catch (IOException e) {
            throw instrumentError(str, e);
        }
    }

    public int instrumentAll(InputStream inputStream, OutputStream outputStream, String str) throws IOException {
        try {
            ContentTypeDetector contentTypeDetector = new ContentTypeDetector(inputStream);
            int type = contentTypeDetector.getType();
            if (type == -889275714) {
                instrument(contentTypeDetector.getInputStream(), outputStream, str);
                return 1;
            }
            if (type == -889270259) {
                return instrumentPack200(contentTypeDetector.getInputStream(), outputStream, str);
            }
            if (type == 529203200) {
                return instrumentGzip(contentTypeDetector.getInputStream(), outputStream, str);
            }
            if (type == 1347093252) {
                return instrumentZip(contentTypeDetector.getInputStream(), outputStream, str);
            }
            copy(contentTypeDetector.getInputStream(), outputStream, str);
            return 0;
        } catch (IOException e) {
            throw instrumentError(str, e);
        }
    }

    public void setRemoveSignatures(boolean z2) {
        this.signatureRemover.setActive(z2);
    }

    public byte[] instrument(byte[] bArr, String str) throws IOException {
        try {
            return instrument(bArr);
        } catch (RuntimeException e) {
            throw instrumentError(str, e);
        }
    }

    public byte[] instrument(InputStream inputStream, String str) throws IOException {
        try {
            return instrument(InputStreams.readFully(inputStream), str);
        } catch (IOException e) {
            throw instrumentError(str, e);
        }
    }

    public void instrument(InputStream inputStream, OutputStream outputStream, String str) throws IOException {
        outputStream.write(instrument(inputStream, str));
    }
}
