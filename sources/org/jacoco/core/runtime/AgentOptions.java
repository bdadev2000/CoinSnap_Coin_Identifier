package org.jacoco.core.runtime;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Pattern;
import org.objectweb.asm.signature.SignatureVisitor;

/* loaded from: classes2.dex */
public final class AgentOptions {
    public static final String ADDRESS = "address";
    public static final String DEFAULT_DESTFILE = "jacoco.exec";
    public static final int DEFAULT_PORT = 6300;
    private final Map<String, String> options;
    private static final Pattern OPTION_SPLIT = Pattern.compile(",(?=[a-zA-Z0-9_\\-]+=)");
    public static final String DEFAULT_ADDRESS = null;
    public static final String DESTFILE = "destfile";
    public static final String APPEND = "append";
    public static final String INCLUDES = "includes";
    public static final String EXCLUDES = "excludes";
    public static final String EXCLCLASSLOADER = "exclclassloader";
    public static final String INCLBOOTSTRAPCLASSES = "inclbootstrapclasses";
    public static final String INCLNOLOCATIONCLASSES = "inclnolocationclasses";
    public static final String SESSIONID = "sessionid";
    public static final String DUMPONEXIT = "dumponexit";
    public static final String OUTPUT = "output";
    public static final String PORT = "port";
    public static final String CLASSDUMPDIR = "classdumpdir";
    public static final String JMX = "jmx";
    private static final Collection<String> VALID_OPTIONS = Arrays.asList(DESTFILE, APPEND, INCLUDES, EXCLUDES, EXCLCLASSLOADER, INCLBOOTSTRAPCLASSES, INCLNOLOCATIONCLASSES, SESSIONID, DUMPONEXIT, OUTPUT, "address", PORT, CLASSDUMPDIR, JMX);

    /* loaded from: classes2.dex */
    public enum OutputMode {
        file,
        tcpserver,
        tcpclient,
        none
    }

    public AgentOptions() {
        this.options = new HashMap();
    }

    private String getOption(String str, String str2) {
        String str3 = this.options.get(str);
        return str3 == null ? str2 : str3;
    }

    private void setOption(String str, int i2) {
        setOption(str, Integer.toString(i2));
    }

    private void validateAll() {
        validatePort(getPort());
        getOutput();
    }

    private void validatePort(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("port must be positive");
        }
    }

    public String getAddress() {
        return getOption("address", DEFAULT_ADDRESS);
    }

    public boolean getAppend() {
        return getOption(APPEND, true);
    }

    public String getClassDumpDir() {
        return getOption(CLASSDUMPDIR, (String) null);
    }

    public String getDestfile() {
        return getOption(DESTFILE, DEFAULT_DESTFILE);
    }

    public boolean getDumpOnExit() {
        return getOption(DUMPONEXIT, true);
    }

    public String getExclClassloader() {
        return getOption(EXCLCLASSLOADER, "sun.reflect.DelegatingClassLoader");
    }

    public String getExcludes() {
        return getOption(EXCLUDES, "");
    }

    public boolean getInclBootstrapClasses() {
        return getOption(INCLBOOTSTRAPCLASSES, false);
    }

    public boolean getInclNoLocationClasses() {
        return getOption(INCLNOLOCATIONCLASSES, false);
    }

    public String getIncludes() {
        return getOption(INCLUDES, "*");
    }

    public boolean getJmx() {
        return getOption(JMX, false);
    }

    public OutputMode getOutput() {
        String str = this.options.get(OUTPUT);
        return str == null ? OutputMode.file : OutputMode.valueOf(str);
    }

    public int getPort() {
        return getOption(PORT, DEFAULT_PORT);
    }

    public String getQuotedVMArgument(File file) {
        return CommandLineSupport.quote(getVMArgument(file));
    }

    public String getSessionId() {
        return getOption(SESSIONID, (String) null);
    }

    public String getVMArgument(File file) {
        return String.format("-javaagent:%s=%s", file, this);
    }

    public String prependVMArguments(String str, File file) {
        List<String> split = CommandLineSupport.split(str);
        String format = String.format("-javaagent:%s", file);
        Iterator<String> it = split.iterator();
        while (it.hasNext()) {
            if (it.next().startsWith(format)) {
                it.remove();
            }
        }
        split.add(0, getVMArgument(file));
        return CommandLineSupport.quote(split);
    }

    public void setAddress(String str) {
        setOption("address", str);
    }

    public void setAppend(boolean z2) {
        setOption(APPEND, z2);
    }

    public void setClassDumpDir(String str) {
        setOption(CLASSDUMPDIR, str);
    }

    public void setDestfile(String str) {
        setOption(DESTFILE, str);
    }

    public void setDumpOnExit(boolean z2) {
        setOption(DUMPONEXIT, z2);
    }

    public void setExclClassloader(String str) {
        setOption(EXCLCLASSLOADER, str);
    }

    public void setExcludes(String str) {
        setOption(EXCLUDES, str);
    }

    public void setInclBootstrapClasses(boolean z2) {
        setOption(INCLBOOTSTRAPCLASSES, z2);
    }

    public void setInclNoLocationClasses(boolean z2) {
        setOption(INCLNOLOCATIONCLASSES, z2);
    }

    public void setIncludes(String str) {
        setOption(INCLUDES, str);
    }

    public void setJmx(boolean z2) {
        setOption(JMX, z2);
    }

    public void setOutput(String str) {
        setOutput(OutputMode.valueOf(str));
    }

    public void setPort(int i2) {
        validatePort(i2);
        setOption(PORT, i2);
    }

    public void setSessionId(String str) {
        setOption(SESSIONID, str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : VALID_OPTIONS) {
            String str2 = this.options.get(str);
            if (str2 != null) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(str);
                sb.append(SignatureVisitor.INSTANCEOF);
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    private boolean getOption(String str, boolean z2) {
        String str2 = this.options.get(str);
        return str2 == null ? z2 : Boolean.parseBoolean(str2);
    }

    private void setOption(String str, boolean z2) {
        setOption(str, Boolean.toString(z2));
    }

    public void setOutput(OutputMode outputMode) {
        setOption(OUTPUT, outputMode.name());
    }

    public AgentOptions(String str) {
        this();
        if (str == null || str.length() <= 0) {
            return;
        }
        for (String str2 : OPTION_SPLIT.split(str)) {
            int indexOf = str2.indexOf(61);
            if (indexOf != -1) {
                String substring = str2.substring(0, indexOf);
                if (VALID_OPTIONS.contains(substring)) {
                    setOption(substring, str2.substring(indexOf + 1));
                } else {
                    throw new IllegalArgumentException(String.format("Unknown agent option \"%s\".", substring));
                }
            } else {
                throw new IllegalArgumentException(String.format("Invalid agent option syntax \"%s\".", str));
            }
        }
        validateAll();
    }

    private void setOption(String str, String str2) {
        this.options.put(str, str2);
    }

    private int getOption(String str, int i2) {
        String str2 = this.options.get(str);
        return str2 == null ? i2 : Integer.parseInt(str2);
    }

    public AgentOptions(Properties properties) {
        this();
        for (String str : VALID_OPTIONS) {
            String property = properties.getProperty(str);
            if (property != null) {
                setOption(str, property);
            }
        }
    }
}
