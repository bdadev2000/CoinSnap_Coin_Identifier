package kotlin.io.path;

import com.mbridge.msdk.MBridgeConstans;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0082\b¢\u0006\u0002\b\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b\n\u001a\u001d\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b\r\u001a&\u0010\u000e\u001a\u0004\u0018\u0001H\u000f\"\u0004\b\u0000\u0010\u000f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0005H\u0082\b¢\u0006\u0004\b\u0010\u0010\u0011\u001aw\u0010\u0012\u001a\u00020\t*\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2Q\b\u0002\u0010\u0014\u001aK\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0013\u0012\u0017\u0012\u00150\u0019j\u0002`\u001a¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007\u001a´\u0001\u0010\u0012\u001a\u00020\t*\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2Q\b\u0002\u0010\u0014\u001aK\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0013\u0012\u0017\u0012\u00150\u0019j\u0002`\u001a¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u00152\u0006\u0010\u001d\u001a\u00020\u001e2C\b\u0002\u0010 \u001a=\u0012\u0004\u0012\u00020!\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\"0\u0015¢\u0006\u0002\b#H\u0007\u001a\f\u0010$\u001a\u00020\u0001*\u00020\tH\u0007\u001a\u001b\u0010%\u001a\f\u0012\b\u0012\u00060\u0019j\u0002`\u001a0&*\u00020\tH\u0002¢\u0006\u0002\b'\u001a'\u0010(\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\t0)2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b*\u001a'\u0010+\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\t0)2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b,\u001a5\u0010-\u001a\u00020\u001e*\b\u0012\u0004\u0012\u00020\t0)2\u0006\u0010.\u001a\u00020\t2\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020100\"\u000201H\u0002¢\u0006\u0004\b2\u00103\u001a\u0011\u00104\u001a\u000205*\u00020\"H\u0003¢\u0006\u0002\b6\u001a\u0011\u00104\u001a\u000205*\u00020\u001cH\u0003¢\u0006\u0002\b6¨\u00067"}, d2 = {"collectIfThrows", "", "collector", "Lkotlin/io/path/ExceptionsCollector;", "function", "Lkotlin/Function0;", "collectIfThrows$PathsKt__PathRecursiveFunctionsKt", "insecureEnterDirectory", MBridgeConstans.DYNAMIC_VIEW_WX_PATH, "Ljava/nio/file/Path;", "insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt", "insecureHandleEntry", "entry", "insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt", "tryIgnoreNoSuchFileException", "R", "tryIgnoreNoSuchFileException$PathsKt__PathRecursiveFunctionsKt", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "copyToRecursively", "target", "onError", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "source", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "Lkotlin/io/path/OnErrorResult;", "followLinks", "", "overwrite", "copyAction", "Lkotlin/io/path/CopyActionContext;", "Lkotlin/io/path/CopyActionResult;", "Lkotlin/ExtensionFunctionType;", "deleteRecursively", "deleteRecursivelyImpl", "", "deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt", "enterDirectory", "Ljava/nio/file/SecureDirectoryStream;", "enterDirectory$PathsKt__PathRecursiveFunctionsKt", "handleEntry", "handleEntry$PathsKt__PathRecursiveFunctionsKt", "isDirectory", "entryName", "options", "", "Ljava/nio/file/LinkOption;", "isDirectory$PathsKt__PathRecursiveFunctionsKt", "(Ljava/nio/file/SecureDirectoryStream;Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z", "toFileVisitResult", "Ljava/nio/file/FileVisitResult;", "toFileVisitResult$PathsKt__PathRecursiveFunctionsKt", "kotlin-stdlib-jdk7"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/path/PathsKt")
@SourceDebugExtension({"SMAP\nPathRecursiveFunctions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,430:1\n346#1,2:434\n354#1:436\n354#1:437\n348#1,4:438\n346#1,2:442\n354#1:444\n348#1,4:445\n354#1:449\n346#1,6:450\n346#1,2:456\n354#1:458\n348#1,4:459\n1#2:431\n1855#3,2:432\n*S KotlinDebug\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n*L\n362#1:434,2\n371#1:436\n374#1:437\n362#1:438,4\n382#1:442,2\n383#1:444\n382#1:445,4\n394#1:449\n402#1:450,6\n420#1:456,2\n421#1:458\n420#1:459,4\n284#1:432,2\n*E\n"})
/* loaded from: classes4.dex */
public class PathsKt__PathRecursiveFunctionsKt extends PathsKt__PathReadWriteKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CopyActionResult.values().length];
            try {
                iArr[CopyActionResult.CONTINUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CopyActionResult.TERMINATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CopyActionResult.SKIP_SUBTREE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OnErrorResult.values().length];
            try {
                iArr2[OnErrorResult.TERMINATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OnErrorResult.SKIP_SUBTREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final void collectIfThrows$PathsKt__PathRecursiveFunctionsKt(ExceptionsCollector exceptionsCollector, Function0<Unit> function0) {
        try {
            function0.invoke();
        } catch (Exception e2) {
            exceptionsCollector.collect(e2);
        }
    }

    @SinceKotlin(version = "1.8")
    @ExperimentalPathApi
    public static final Path copyToRecursively(Path path, Path target, Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> onError, final boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(onError, "onError");
        if (z11) {
            return copyToRecursively(path, target, onError, z10, new Function3<CopyActionContext, Path, Path, CopyActionResult>() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ CopyActionResult invoke(CopyActionContext copyActionContext, Path path2, Path path3) {
                    return invoke2(copyActionContext, d2.a.q(path2), d2.a.q(path3));
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final CopyActionResult invoke2(CopyActionContext copyToRecursively, Path src, Path dst) {
                    Intrinsics.checkNotNullParameter(copyToRecursively, "$this$copyToRecursively");
                    Intrinsics.checkNotNullParameter(src, "src");
                    Intrinsics.checkNotNullParameter(dst, "dst");
                    LinkOption[] linkOptions = LinkFollowing.INSTANCE.toLinkOptions(z10);
                    boolean isDirectory = Files.isDirectory(dst, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1));
                    LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptions, linkOptions.length);
                    if (!Files.isDirectory(src, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length)) || !isDirectory) {
                        if (isDirectory) {
                            PathsKt__PathRecursiveFunctionsKt.deleteRecursively(dst);
                        }
                        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                        spreadBuilder.addSpread(linkOptions);
                        spreadBuilder.add(StandardCopyOption.REPLACE_EXISTING);
                        CopyOption[] copyOptionArr = (CopyOption[]) spreadBuilder.toArray(new CopyOption[spreadBuilder.size()]);
                        Intrinsics.checkNotNullExpressionValue(Files.copy(src, dst, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length)), "copy(...)");
                    }
                    return CopyActionResult.CONTINUE;
                }
            });
        }
        return copyToRecursively$default(path, target, onError, z10, (Function3) null, 8, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> function3, Path path, Path path2, Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function32, Path path3, BasicFileAttributes basicFileAttributes) {
        try {
            return toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(function3.invoke(DefaultCopyActionContext.INSTANCE, path3, copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt(path, path2, path3)));
        } catch (Exception e2) {
            return copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(function32, path, path2, path3, e2);
        }
    }

    public static /* synthetic */ Path copyToRecursively$default(Path path, Path path2, Function3 function3, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function3 = new Function3() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
                    return invoke(d2.a.q(obj2), d2.a.q(obj3), (Exception) obj4);
                }

                public final Void invoke(Path path3, Path path4, Exception exception) {
                    Intrinsics.checkNotNullParameter(path3, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(path4, "<anonymous parameter 1>");
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    throw exception;
                }
            };
        }
        return copyToRecursively(path, path2, (Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult>) function3, z10, z11);
    }

    private static final Path copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt(Path path, Path path2, Path path3) {
        Path resolve;
        resolve = path2.resolve(PathsKt__PathUtilsKt.relativeTo(path3, path).toString());
        Intrinsics.checkNotNullExpressionValue(resolve, "resolve(...)");
        return resolve;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function3, Path path, Path path2, Path path3, Exception exc) {
        return toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(function3.invoke(path3, copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt(path, path2, path3), exc));
    }

    @SinceKotlin(version = "1.8")
    @ExperimentalPathApi
    public static final void deleteRecursively(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        List<Exception> deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt = deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt(path);
        if (!deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt.isEmpty()) {
            a.t();
            FileSystemException i10 = b.i();
            Iterator<T> it = deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt.iterator();
            while (it.hasNext()) {
                ExceptionsKt.addSuppressed(i10, (Exception) it.next());
            }
            throw i10;
        }
    }

    private static final List<Exception> deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt(Path path) {
        Path parent;
        DirectoryStream directoryStream;
        Path fileName;
        int i10 = 0;
        int i11 = 1;
        ExceptionsCollector exceptionsCollector = new ExceptionsCollector(i10, i11, null);
        parent = path.getParent();
        if (parent != null) {
            try {
                directoryStream = Files.newDirectoryStream(parent);
            } catch (Throwable unused) {
                directoryStream = null;
            }
            if (directoryStream != null) {
                try {
                    DirectoryStream f10 = b.f(directoryStream);
                    if (b.w(f10)) {
                        exceptionsCollector.setPath(parent);
                        SecureDirectoryStream s5 = b.s(f10);
                        fileName = path.getFileName();
                        Intrinsics.checkNotNullExpressionValue(fileName, "getFileName(...)");
                        handleEntry$PathsKt__PathRecursiveFunctionsKt(s5, fileName, exceptionsCollector);
                    } else {
                        i10 = 1;
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(directoryStream, null);
                    i11 = i10;
                } finally {
                }
            }
        }
        if (i11 != 0) {
            insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(path, exceptionsCollector);
        }
        return exceptionsCollector.getCollectedExceptions();
    }

    private static final void enterDirectory$PathsKt__PathRecursiveFunctionsKt(SecureDirectoryStream<Path> secureDirectoryStream, Path path, ExceptionsCollector exceptionsCollector) {
        SecureDirectoryStream<Path> secureDirectoryStream2;
        try {
            try {
                secureDirectoryStream2 = secureDirectoryStream.newDirectoryStream(path, LinkOption.NOFOLLOW_LINKS);
            } catch (NoSuchFileException unused) {
                secureDirectoryStream2 = null;
            }
            if (secureDirectoryStream2 != null) {
                try {
                    Iterator<Path> it = secureDirectoryStream2.iterator();
                    while (it.hasNext()) {
                        Path fileName = it.next().getFileName();
                        Intrinsics.checkNotNullExpressionValue(fileName, "getFileName(...)");
                        handleEntry$PathsKt__PathRecursiveFunctionsKt(secureDirectoryStream2, fileName, exceptionsCollector);
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(secureDirectoryStream2, null);
                } finally {
                }
            }
        } catch (Exception e2) {
            exceptionsCollector.collect(e2);
        }
    }

    private static final void handleEntry$PathsKt__PathRecursiveFunctionsKt(SecureDirectoryStream<Path> secureDirectoryStream, Path path, ExceptionsCollector exceptionsCollector) {
        exceptionsCollector.enterEntry(path);
        try {
        } catch (Exception e2) {
            exceptionsCollector.collect(e2);
        }
        if (isDirectory$PathsKt__PathRecursiveFunctionsKt(secureDirectoryStream, path, LinkOption.NOFOLLOW_LINKS)) {
            int totalExceptions = exceptionsCollector.getTotalExceptions();
            enterDirectory$PathsKt__PathRecursiveFunctionsKt(secureDirectoryStream, path, exceptionsCollector);
            if (totalExceptions == exceptionsCollector.getTotalExceptions()) {
                secureDirectoryStream.deleteDirectory(path);
                Unit unit = Unit.INSTANCE;
            }
            exceptionsCollector.exitEntry(path);
        }
        secureDirectoryStream.deleteFile(path);
        Unit unit2 = Unit.INSTANCE;
        exceptionsCollector.exitEntry(path);
    }

    private static final void insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt(Path path, ExceptionsCollector exceptionsCollector) {
        DirectoryStream<Path> directoryStream;
        try {
            try {
                directoryStream = Files.newDirectoryStream(path);
            } catch (NoSuchFileException unused) {
                directoryStream = null;
            }
            if (directoryStream != null) {
                try {
                    for (Path path2 : directoryStream) {
                        Intrinsics.checkNotNull(path2);
                        insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(path2, exceptionsCollector);
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(directoryStream, null);
                } finally {
                }
            }
        } catch (Exception e2) {
            exceptionsCollector.collect(e2);
        }
    }

    private static final void insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(Path path, ExceptionsCollector exceptionsCollector) {
        try {
            if (Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
                int totalExceptions = exceptionsCollector.getTotalExceptions();
                insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt(path, exceptionsCollector);
                if (totalExceptions == exceptionsCollector.getTotalExceptions()) {
                    Files.deleteIfExists(path);
                }
            } else {
                Files.deleteIfExists(path);
            }
        } catch (Exception e2) {
            exceptionsCollector.collect(e2);
        }
    }

    private static final boolean isDirectory$PathsKt__PathRecursiveFunctionsKt(SecureDirectoryStream<Path> secureDirectoryStream, Path path, LinkOption... linkOptionArr) {
        Boolean bool;
        try {
            bool = Boolean.valueOf(((BasicFileAttributeView) secureDirectoryStream.getFileAttributeView(path, BasicFileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))).readAttributes().isDirectory());
        } catch (NoSuchFileException unused) {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @ExperimentalPathApi
    private static final FileVisitResult toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(CopyActionResult copyActionResult) {
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        FileVisitResult fileVisitResult3;
        int i10 = WhenMappings.$EnumSwitchMapping$0[copyActionResult.ordinal()];
        if (i10 == 1) {
            fileVisitResult = FileVisitResult.CONTINUE;
            return fileVisitResult;
        }
        if (i10 == 2) {
            fileVisitResult2 = FileVisitResult.TERMINATE;
            return fileVisitResult2;
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        fileVisitResult3 = FileVisitResult.SKIP_SUBTREE;
        return fileVisitResult3;
    }

    private static final <R> R tryIgnoreNoSuchFileException$PathsKt__PathRecursiveFunctionsKt(Function0<? extends R> function0) {
        try {
            return function0.invoke();
        } catch (NoSuchFileException unused) {
            return null;
        }
    }

    @SinceKotlin(version = "1.8")
    @ExperimentalPathApi
    public static final Path copyToRecursively(final Path path, final Path target, final Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> onError, boolean z10, final Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> copyAction) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(copyAction, "copyAction");
        LinkOption[] linkOptions = LinkFollowing.INSTANCE.toLinkOptions(z10);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptions, linkOptions.length);
        if (Files.exists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            boolean z11 = false;
            if (Files.exists(path, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && (z10 || !Files.isSymbolicLink(path))) {
                boolean z12 = Files.exists(target, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && !Files.isSymbolicLink(target);
                if (!z12 || !Files.isSameFile(path, target)) {
                    if (Intrinsics.areEqual(path.getFileSystem(), target.getFileSystem())) {
                        if (z12) {
                            z11 = target.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0]));
                        } else {
                            Path parent = target.getParent();
                            if (parent != null && Files.exists(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && parent.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0]))) {
                                z11 = true;
                            }
                        }
                    }
                    if (z11) {
                        a.t();
                        throw a.g(path.toString(), target.toString());
                    }
                }
            }
            PathsKt__PathUtilsKt.visitFileTree$default(path, 0, z10, new Function1<FileVisitorBuilder, Unit>() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$1, reason: invalid class name */
                /* loaded from: classes4.dex */
                public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<Path, BasicFileAttributes, FileVisitResult> {
                    final /* synthetic */ Function3<CopyActionContext, Path, Path, CopyActionResult> $copyAction;
                    final /* synthetic */ Function3<Path, Path, Exception, OnErrorResult> $onError;
                    final /* synthetic */ Path $target;
                    final /* synthetic */ Path $this_copyToRecursively;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public AnonymousClass1(Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> function3, Path path, Path path2, Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function32) {
                        super(2, Intrinsics.Kotlin.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
                        this.$copyAction = function3;
                        this.$this_copyToRecursively = path;
                        this.$target = path2;
                        this.$onError = function32;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ FileVisitResult invoke(Path path, BasicFileAttributes basicFileAttributes) {
                        return invoke2(d2.a.q(path), b.t(basicFileAttributes));
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final FileVisitResult invoke2(Path p02, BasicFileAttributes p12) {
                        FileVisitResult copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt;
                        Intrinsics.checkNotNullParameter(p02, "p0");
                        Intrinsics.checkNotNullParameter(p12, "p1");
                        copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt = PathsKt__PathRecursiveFunctionsKt.copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(this.$copyAction, this.$this_copyToRecursively, this.$target, this.$onError, p02, p12);
                        return copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt;
                    }
                }

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2, reason: invalid class name */
                /* loaded from: classes4.dex */
                public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function2<Path, BasicFileAttributes, FileVisitResult> {
                    final /* synthetic */ Function3<CopyActionContext, Path, Path, CopyActionResult> $copyAction;
                    final /* synthetic */ Function3<Path, Path, Exception, OnErrorResult> $onError;
                    final /* synthetic */ Path $target;
                    final /* synthetic */ Path $this_copyToRecursively;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public AnonymousClass2(Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> function3, Path path, Path path2, Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function32) {
                        super(2, Intrinsics.Kotlin.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
                        this.$copyAction = function3;
                        this.$this_copyToRecursively = path;
                        this.$target = path2;
                        this.$onError = function32;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ FileVisitResult invoke(Path path, BasicFileAttributes basicFileAttributes) {
                        return invoke2(d2.a.q(path), b.t(basicFileAttributes));
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final FileVisitResult invoke2(Path p02, BasicFileAttributes p12) {
                        FileVisitResult copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt;
                        Intrinsics.checkNotNullParameter(p02, "p0");
                        Intrinsics.checkNotNullParameter(p12, "p1");
                        copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt = PathsKt__PathRecursiveFunctionsKt.copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(this.$copyAction, this.$this_copyToRecursively, this.$target, this.$onError, p02, p12);
                        return copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt;
                    }
                }

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$3, reason: invalid class name */
                /* loaded from: classes4.dex */
                public /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function2<Path, Exception, FileVisitResult> {
                    final /* synthetic */ Function3<Path, Path, Exception, OnErrorResult> $onError;
                    final /* synthetic */ Path $target;
                    final /* synthetic */ Path $this_copyToRecursively;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public AnonymousClass3(Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function3, Path path, Path path2) {
                        super(2, Intrinsics.Kotlin.class, "error", "copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;", 0);
                        this.$onError = function3;
                        this.$this_copyToRecursively = path;
                        this.$target = path2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ FileVisitResult invoke(Path path, Exception exc) {
                        return invoke2(d2.a.q(path), exc);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final FileVisitResult invoke2(Path p02, Exception p12) {
                        FileVisitResult copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt;
                        Intrinsics.checkNotNullParameter(p02, "p0");
                        Intrinsics.checkNotNullParameter(p12, "p1");
                        copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt = PathsKt__PathRecursiveFunctionsKt.copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(this.$onError, this.$this_copyToRecursively, this.$target, p02, p12);
                        return copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(FileVisitorBuilder fileVisitorBuilder) {
                    invoke2(fileVisitorBuilder);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(FileVisitorBuilder visitFileTree) {
                    Intrinsics.checkNotNullParameter(visitFileTree, "$this$visitFileTree");
                    visitFileTree.onPreVisitDirectory(new AnonymousClass1(copyAction, path, target, onError));
                    visitFileTree.onVisitFile(new AnonymousClass2(copyAction, path, target, onError));
                    visitFileTree.onVisitFileFailed(new AnonymousClass3(onError, path, target));
                    final Function3<Path, Path, Exception, OnErrorResult> function3 = onError;
                    final Path path2 = path;
                    final Path path3 = target;
                    visitFileTree.onPostVisitDirectory(new Function2<Path, IOException, FileVisitResult>() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ FileVisitResult invoke(Path path4, IOException iOException) {
                            return invoke2(d2.a.q(path4), iOException);
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final FileVisitResult invoke2(Path directory, IOException iOException) {
                            FileVisitResult copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt;
                            FileVisitResult fileVisitResult;
                            Intrinsics.checkNotNullParameter(directory, "directory");
                            if (iOException == null) {
                                fileVisitResult = FileVisitResult.CONTINUE;
                                return fileVisitResult;
                            }
                            copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt = PathsKt__PathRecursiveFunctionsKt.copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(function3, path2, path3, directory, iOException);
                            return copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt;
                        }
                    });
                }
            }, 1, (Object) null);
            return target;
        }
        a.D();
        throw b.j(path.toString(), target.toString());
    }

    public static /* synthetic */ Path copyToRecursively$default(Path path, Path path2, Function3 function3, final boolean z10, Function3 function32, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function3 = new Function3() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
                    return invoke(d2.a.q(obj2), d2.a.q(obj3), (Exception) obj4);
                }

                public final Void invoke(Path path3, Path path4, Exception exception) {
                    Intrinsics.checkNotNullParameter(path3, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(path4, "<anonymous parameter 1>");
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    throw exception;
                }
            };
        }
        if ((i10 & 8) != 0) {
            function32 = new Function3<CopyActionContext, Path, Path, CopyActionResult>() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ CopyActionResult invoke(CopyActionContext copyActionContext, Path path3, Path path4) {
                    return invoke2(copyActionContext, d2.a.q(path3), d2.a.q(path4));
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final CopyActionResult invoke2(CopyActionContext copyActionContext, Path src, Path dst) {
                    Intrinsics.checkNotNullParameter(copyActionContext, "$this$null");
                    Intrinsics.checkNotNullParameter(src, "src");
                    Intrinsics.checkNotNullParameter(dst, "dst");
                    return copyActionContext.copyToIgnoringExistingDirectory(src, dst, z10);
                }
            };
        }
        return copyToRecursively(path, path2, (Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult>) function3, z10, (Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult>) function32);
    }

    @ExperimentalPathApi
    private static final FileVisitResult toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(OnErrorResult onErrorResult) {
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        int i10 = WhenMappings.$EnumSwitchMapping$1[onErrorResult.ordinal()];
        if (i10 == 1) {
            fileVisitResult = FileVisitResult.TERMINATE;
            return fileVisitResult;
        }
        if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        fileVisitResult2 = FileVisitResult.SKIP_SUBTREE;
        return fileVisitResult2;
    }
}
