package org.jacoco.core.analysis;

import androidx.compose.foundation.text.input.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.StringTokenizer;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.jacoco.core.JaCoCo;
import org.jacoco.core.data.ExecutionData;
import org.jacoco.core.data.ExecutionDataStore;
import org.jacoco.core.internal.ContentTypeDetector;
import org.jacoco.core.internal.InputStreams;
import org.jacoco.core.internal.Pack200Streams;
import org.jacoco.core.internal.analysis.ClassAnalyzer;
import org.jacoco.core.internal.analysis.ClassCoverageImpl;
import org.jacoco.core.internal.analysis.StringPool;
import org.jacoco.core.internal.data.CRC64;
import org.jacoco.core.internal.flow.ClassProbesAdapter;
import org.jacoco.core.internal.instr.InstrSupport;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;

/* loaded from: classes2.dex */
public class Analyzer {
    private final ICoverageVisitor coverageVisitor;
    private final ExecutionDataStore executionData;
    private final StringPool stringPool = new StringPool();

    public Analyzer(ExecutionDataStore executionDataStore, ICoverageVisitor iCoverageVisitor) {
        this.executionData = executionDataStore;
        this.coverageVisitor = iCoverageVisitor;
    }

    private void analyzeClass(byte[] bArr) {
        long classId = CRC64.classId(bArr);
        ClassReader classReaderFor = InstrSupport.classReaderFor(bArr);
        if ((classReaderFor.getAccess() & 32768) == 0 && (classReaderFor.getAccess() & 4096) == 0) {
            classReaderFor.accept(createAnalyzingVisitor(classId, classReaderFor.getClassName()), 0);
        }
    }

    private int analyzeGzip(InputStream inputStream, String str) throws IOException {
        try {
            return analyzeAll(new GZIPInputStream(inputStream), str);
        } catch (IOException e) {
            throw analyzerError(str, e);
        }
    }

    private int analyzePack200(InputStream inputStream, String str) throws IOException {
        try {
            return analyzeAll(Pack200Streams.unpack(inputStream), str);
        } catch (IOException e) {
            throw analyzerError(str, e);
        }
    }

    private int analyzeZip(InputStream inputStream, String str) throws IOException {
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        int i2 = 0;
        while (true) {
            ZipEntry nextEntry = nextEntry(zipInputStream, str);
            if (nextEntry == null) {
                return i2;
            }
            StringBuilder B = a.B(str, "@");
            B.append(nextEntry.getName());
            i2 += analyzeAll(zipInputStream, B.toString());
        }
    }

    private IOException analyzerError(String str, Exception exc) {
        IOException iOException = new IOException(String.format("Error while analyzing %s with JaCoCo %s/%s.", str, JaCoCo.VERSION, JaCoCo.COMMITID_SHORT));
        iOException.initCause(exc);
        return iOException;
    }

    private ClassVisitor createAnalyzingVisitor(long j2, String str) {
        boolean[] probes;
        boolean z2;
        ExecutionData executionData = this.executionData.get(j2);
        if (executionData == null) {
            z2 = this.executionData.contains(str);
            probes = null;
        } else {
            probes = executionData.getProbes();
            z2 = false;
        }
        boolean[] zArr = probes;
        final ClassCoverageImpl classCoverageImpl = new ClassCoverageImpl(str, j2, z2);
        return new ClassProbesAdapter(new ClassAnalyzer(classCoverageImpl, zArr, this.stringPool) { // from class: org.jacoco.core.analysis.Analyzer.1
            @Override // org.objectweb.asm.ClassVisitor
            public void visitEnd() {
                super.visitEnd();
                Analyzer.this.coverageVisitor.visitCoverage(classCoverageImpl);
            }
        }, false);
    }

    private ZipEntry nextEntry(ZipInputStream zipInputStream, String str) throws IOException {
        try {
            return zipInputStream.getNextEntry();
        } catch (IOException e) {
            throw analyzerError(str, e);
        }
    }

    public int analyzeAll(InputStream inputStream, String str) throws IOException {
        try {
            ContentTypeDetector contentTypeDetector = new ContentTypeDetector(inputStream);
            int type = contentTypeDetector.getType();
            if (type == -889275714) {
                analyzeClass(contentTypeDetector.getInputStream(), str);
                return 1;
            }
            if (type == -889270259) {
                return analyzePack200(contentTypeDetector.getInputStream(), str);
            }
            if (type == 529203200) {
                return analyzeGzip(contentTypeDetector.getInputStream(), str);
            }
            if (type != 1347093252) {
                return 0;
            }
            return analyzeZip(contentTypeDetector.getInputStream(), str);
        } catch (IOException e) {
            throw analyzerError(str, e);
        }
    }

    public void analyzeClass(byte[] bArr, String str) throws IOException {
        try {
            analyzeClass(bArr);
        } catch (RuntimeException e) {
            throw analyzerError(str, e);
        }
    }

    public int analyzeAll(File file) throws IOException {
        int analyzeAll;
        if (file.isDirectory()) {
            analyzeAll = 0;
            for (File file2 : file.listFiles()) {
                analyzeAll += analyzeAll(file2);
            }
        } else {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                analyzeAll = analyzeAll(fileInputStream, file.getPath());
            } finally {
                fileInputStream.close();
            }
        }
        return analyzeAll;
    }

    public void analyzeClass(InputStream inputStream, String str) throws IOException {
        try {
            analyzeClass(InputStreams.readFully(inputStream), str);
        } catch (IOException e) {
            throw analyzerError(str, e);
        }
    }

    public int analyzeAll(String str, File file) throws IOException {
        StringTokenizer stringTokenizer = new StringTokenizer(str, File.pathSeparator);
        int i2 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            i2 += analyzeAll(new File(file, stringTokenizer.nextToken()));
        }
        return i2;
    }
}
