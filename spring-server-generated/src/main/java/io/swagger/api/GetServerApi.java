/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.Server;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-27T20:38:22.907Z[GMT]")
@Api(value = "getServer", description = "the getServer API", tags = { "getServer", })
public interface GetServerApi {

    @ApiOperation(value = "Get all server objects", nickname = "getServer", notes = "", tags = { "getServer", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Server returned successfully!") })
    @RequestMapping(value = "/getServer", method = RequestMethod.GET)
    List<Server> getServer();

    @ApiOperation(value = "Get a server object by id", nickname = "getServerById", notes = "", tags = { "getServer", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Server returned successfully!") })
    @RequestMapping(value = "/getServer/id/{id}", method = RequestMethod.GET)
    ResponseEntity<?> getServerById(
            @ApiParam(value = "Server id that needs to be found", required = true) @PathVariable("id") String id);

    @ApiOperation(value = "Get a server object by name", nickname = "getServerByName", notes = "", tags = {
            "getServer", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Server returned successfully!") })
    @RequestMapping(value = "/getServer/name/{name}", method = RequestMethod.GET)
    ResponseEntity<?> getServerByName(
            @ApiParam(value = "Server name that needs to be found", required = true) @PathVariable("name") String name);

}