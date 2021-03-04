package com.mindlinksoft.recruitment.mychat;

import picocli.CommandLine.Option;
import picocli.CommandLine.Command;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents the configuration for the exporter.
 */
@Command(name = "export", mixinStandardHelpOptions = true, version = "exporter 1.0",
         description = "Exports a plain text chat log into a JSON file.")
public final class ConversationExporterConfiguration {
	public String filterByUser;
    /**
     * Gets the input file path.
     */
    @Option(names = { "-i", "--inputFilePath" }, description = "The path to the input chat log file.", required = true)
    public String inputFilePath;

    /**
     * Gets the output file path.
     */
    @Option(names = { "-o", "--outputFilePath" }, description = "The path to the output JSON file.", required = true)
    public String outputFilePath;
	/**
     * Gets filter user name.
     */
    @Option(names = "--filterByUser", description = "The user to filter messages by.")
    public String filterByUserfilterByUser;
	/**
     * Gets filter keyword.
     */
    @Option(names = "--filterByKeyword", description = "The keyword to filter messages by.")
    public String filterByKeyword;
	/**
     * Sets word blacklsit.
     */
    @Option(names = "--blacklist", description = "List of words to blacklist.")
    public List<String> blacklist;

}
