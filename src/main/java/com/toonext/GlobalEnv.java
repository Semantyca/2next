package com.toonext;

import com.toonext.localization.TemplatesSet;
import com.toonext.localization.Vocabulary;
import com.toonext.log.Lg;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

public class GlobalEnv {

    public static Date startTime;
    public static String orgName;
    public static String orgShortName;
    public static String color;
    public static String logo;
    public static String wallpaper;

    public static int httpPort = EnvConst.DEFAULT_HTTP_PORT;
    public static HashMap<String, String> mimeHash = new HashMap<>();
    public static String tmpDir = System.getProperty("user.home") + File.separator + "tmp";
    public static String trash;

    public static Boolean isTLSEnable = false;
    public static int secureHttpPort;
    public static String certFile = "";
    public static String certKeyFile = "";

    public static Boolean mailEnable = false;
    public static String smtpPort = "25";
    public static boolean smtpAuth;
    public static String smtpHost;
    public static String smtpUser;
    public static String smtpPassword;
    public static String smtpUserName;

    public static Boolean slackEnable = false;
    public static String slackToken;

    public static Boolean translatorEnable = false;
    public static String translatorEngine = EnvConst.DEFAULT_TRANSLATOR_ENGINE;
    public static String yandexTranslatorApiKey;

    public static Boolean elasticSearchEnable = false;
    public static int elasticSearchPort;
    public static String elasticSearchHost;

    public static Boolean weatherServiceEnable = false;
    public static String weatherServiceEngine = EnvConst.DEFAULT_WEATHER_SERVICE_ENGINE;
    public static String weatherServiceApiKey;
    public static String weatherServiceLocality;

    public static Boolean mapServiceEnable = false;
    public static String mapEngine = EnvConst.DEFAULT_MAP_SERVICE_ENGINE;
    public static String mapsApiKey;

    public static boolean XMPPServerEnable;
    public static String XMPPServer;
    public static String XMPPLogin;
    public static String XMPPPwd;
    //public static ChatManager chatmanager;

    public static boolean integrationHubEnable = false;
    public static String integrationHubHost;
    public static Vocabulary vocabulary;
    public static TemplatesSet templates;


    private static String hostName;
    private static String virtualHostName;
    private static boolean isDevMode;
    private static String officeFrameDir;
    private static String kernelDir;






    public static String getHostName() {
        return hostName;
    }

    public static String getVirtualHostName() {
        return virtualHostName;
    }

    public static String getDomain() {
        if (virtualHostName.isEmpty()) {
            return hostName;
        } else {
            return virtualHostName;
        }
    }



    public static String getWorkspaceURL() {
        return "/" + EnvConst.WORKSPACE_MODULE_NAME;
    }

    private static void initMimeTypes() {
        mimeHash.put("pdf", "application/pdf");
        mimeHash.put("doc", "application/msword");
        mimeHash.put("xls", "application/vnd.ms-excel");
        mimeHash.put("tif", "image/tiff");
        mimeHash.put("rtf", "application/msword");
        mimeHash.put("gif", "image/gif");
        mimeHash.put("jpg", "image/jpeg");
        mimeHash.put("assets", "text/html");
        mimeHash.put("zip", "application/zip");
        mimeHash.put("rar", "application/x-rar-compressed");
    }

    private static Document getDocument() {
        try {
            final DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder;

            builder = domFactory.newDocumentBuilder();
            return builder.parse(EnvConst.CFG_FILE);
        } catch (final SAXException e) {
            Lg.exception(e);
        } catch (final IOException e) {
            Lg.exception(e);
        } catch (final ParserConfigurationException e) {
            Lg.exception(e);
        }
        return null;
    }


    public static boolean isDevMode() {
        return isDevMode;
    }


    public static String getOfficeFrameDir() {
        return officeFrameDir;
    }

    public static String getKernelDir() {
        return kernelDir;
    }



}
